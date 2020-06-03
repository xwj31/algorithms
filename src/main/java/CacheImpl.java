import java.lang.ref.SoftReference;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

//could be improved with a delay queue.

public class CacheImpl implements Cache {

    private static int CLEAN_UP_TIME_IN_SEC = 5;

    public CacheImpl() {

        Thread cleaningThread = new Thread( () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(CLEAN_UP_TIME_IN_SEC * 1000);
                    cache.entrySet().removeIf(entry -> Optional.ofNullable(entry.getValue()).map(SoftReference::get).map(CacheObject::isExpired).orElse(false));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        cleaningThread.setDaemon(true);
        cleaningThread.start();
    }

    private final ConcurrentHashMap<String, SoftReference<CacheObject>> cache = new ConcurrentHashMap<>(); //thread safe

    @Override
    public void add(String key, Object value, long timeInMilliseconds) {

        if (key == null) {
            return;
        }

        if (value == null) {
            cache.remove(key);
        }

        long expiryTime = System.currentTimeMillis() + timeInMilliseconds;
        cache.put(key, new SoftReference<>(new CacheObject(value, expiryTime))); //softReference will be removed before out of memory can occur
    }

    @Override
    public void remove(String key) {
        cache.remove(key);
    }

    @Override
    public Object get(String key) {
        return cache.get(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public long size() {
        return cache.size();
    }

    private static class CacheObject {

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public long getExpiryTime() {
            return expiryTime;
        }

        public void setExpiryTime(long expiryTime) {
            this.expiryTime = expiryTime;
        }

        public CacheObject(Object value, long expiryTime) {
            this.value = value;
            this.expiryTime = expiryTime;
        }

        private Object value;
        private long expiryTime;

        boolean isExpired() {
            return System.currentTimeMillis() > expiryTime;
        }
    }
}

public interface Cache<T> {

    void add(String key, T value, long timeInMilliseconds);

    void remove(String key);

    T get(String key);

    void clear();

    long size();
}
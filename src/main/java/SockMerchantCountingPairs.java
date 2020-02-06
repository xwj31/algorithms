import java.io.IOException;
import java.util.*;

public class SockMerchantCountingPairs {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int yourSocks = 0;

        // hashmap to store the frequency of element
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : ar) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            if (val.getValue() >= 2) {
                yourSocks = yourSocks + (val.getValue() /2);
            }
        }
        return yourSocks;
    }

    public static void main(String[] args) {
        int result = sockMerchant(3, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        System.out.println(result);
    }
}

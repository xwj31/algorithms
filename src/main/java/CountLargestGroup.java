import java.util.*;

public class CountLargestGroup {

    public int countLargestGroup(int n ) {

        int maxFreq = 0, dp[] = new int[n + 1], res = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            dp[i] = i % 10 + dp[i / 10];
            map.put(dp[i], map.getOrDefault(dp[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                res = 1;
            } else if (map.get(key) == maxFreq) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        CountLargestGroup countLargestGroup = new CountLargestGroup();
        System.out.println(countLargestGroup.countLargestGroup(13) == 4 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(2) == 2 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(15) == 6 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(24) == 5 ? "Test passed" : "Test failed");
    }

}

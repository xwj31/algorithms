import java.util.*;

public class FindLuckyIntegerInArray {

    public int findLucky(int[] arr) {

        Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getKey().equals(e.getValue()))
                return e.getKey();
        }
        return -1;

    }

    public static void main(String[] args) {
        FindLuckyIntegerInArray findLuckyIntegerInArray = new FindLuckyIntegerInArray();
        System.out.println(findLuckyIntegerInArray.findLucky(new int[]{2,2,3,4}) == 2 ? "Test passed" : "Test failed");
        System.out.println(findLuckyIntegerInArray.findLucky(new int[]{1,2,2,3,3,3}) == 3 ? "Test passed" : "Test failed");
        System.out.println(findLuckyIntegerInArray.findLucky(new int[]{5}) == -1 ? "Test passed" : "Test failed");
        System.out.println(findLuckyIntegerInArray.findLucky(new int[]{2,2,2,3,3}) == -1 ? "Test passed" : "Test failed");
    }
}

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int oddElements = 0;

        // hashmap to store the frequency of element
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            if (val.getValue() < 2) {
                oddElements = val.getKey();
            }
        }
        return oddElements;


    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();

        System.out.println(singleNumber.singleNumber(new int[]{2,2,1}) == 1 ? "Test passed" : "Test failed");
        System.out.println(singleNumber.singleNumber(new int[]{4,1,2,1,2}) == 4 ? "Test passed" : "Test failed");
    }


}

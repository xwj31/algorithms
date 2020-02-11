import java.util.HashMap;
import java.util.Map;

public class OddElementsArray {

    public int solution(int[] A) {

        int oddElements = 0;

        // hashmap to store the frequency of element
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : A) {
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
        OddElementsArray oddElementsArray = new OddElementsArray();

        if (oddElementsArray.solution(new int[]{9,3,9,3,9,7,9}) == 7) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}

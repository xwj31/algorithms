import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        ArrayList<Integer> outputArray = new ArrayList<>();

        ArrayList<Integer> leftWorkingArray = IntStream.of(nums).limit(n).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> rightWorkingArray = IntStream.of(nums).skip(n).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < n; i++) {
            outputArray.add(leftWorkingArray.get(i));
            outputArray.add(rightWorkingArray.get(i));
        }

        return outputArray.stream().mapToInt(i ->i).toArray();
     }


    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.equals(shuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3), new int[]{2, 3, 5, 4, 1, 7}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(shuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4), new int[]{1, 4, 2, 3, 3, 2, 4, 1}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(shuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2), new int[]{1, 2, 1, 2}) ? "Test passed" : "Test failed");
    }
}

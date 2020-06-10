import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {


    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> workingList = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            workingList.add(index[i], nums[i]);
        }

        return workingList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder createTargetArrayInTheGivenOrder = new CreateTargetArrayInTheGivenOrder();
        System.out.println(Arrays.equals(createTargetArrayInTheGivenOrder.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}), new int[]{0, 4, 1, 3, 2}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(createTargetArrayInTheGivenOrder.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}), new int[]{0, 1, 2, 3, 4}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(createTargetArrayInTheGivenOrder.createTargetArray(new int[]{1}, new int[]{0}), new int[]{1}) ? "Test passed" : "Test failed");
    }
}

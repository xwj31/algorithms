import java.util.ArrayList;

public class RemoveDuplicatesFromArray {

    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> workingArray = new ArrayList<>();
        workingArray.add(nums[0]);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                workingArray.add(nums[i+1]);
                nums[i] = nums[i+1];
            }
        }

        nums = workingArray.stream().mapToInt(i -> i).toArray();
        return nums.length;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();

        System.out.println(removeDuplicatesFromArray.removeDuplicates(new int[]{1,1,2}) == 2 ? "Test passed" : "Test failed");
        System.out.println(removeDuplicatesFromArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}) == 5 ? "Test passed" : "Test failed");
    }
}

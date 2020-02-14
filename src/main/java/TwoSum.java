import java.util.Arrays;

public class TwoSum {

    public int[] solution(int[] nums, int target){

        int[] workingArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    workingArray[1] = i;
                    workingArray[0] = j;
                    break;
                }
            }
        }
        return workingArray;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(
                Arrays.equals(twoSum.solution(new int[]{2,7,11,15},9),new int[]{0,1} )
                        ? "Test passed" : "Test failed");

        System.out.println(
                Arrays.equals(twoSum.solution(new int[]{3,3},6), new int[]{0,1})
                    ? "Test passed" : "Test failed");
    }
}

import java.util.Arrays;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {

        int[] workingArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                workingArray[i] = nums[i];
            } else {
                int add = workingArray[i-1]+nums[i];
                workingArray[i] = add;
            }
        }
        return workingArray;
    }

    public static void main(String[] args) {
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        System.out.println(Arrays.equals(runningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4}), new int[]{1, 3, 6, 10}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(runningSumOf1DArray.runningSum(new int[]{1,1,1,1,1}), new int[]{1,2,3,4,5}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(runningSumOf1DArray.runningSum(new int[]{3,1,2,10,1}), new int[]{3,4,6,16,17}) ? "Test passed" : "Test failed");
    }
}

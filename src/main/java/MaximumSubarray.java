public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maximum = nums[0];
        int workingMaximum = nums[0];

        for (int num : nums) {
            workingMaximum = workingMaximum + num;
            if (workingMaximum < num) {
                workingMaximum = num;
            }
            if (workingMaximum > maximum) {
                maximum = workingMaximum;
            }
        }
        return Math.max(workingMaximum, maximum);
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6 ? "Test passed" : "Test failed");
    }
}

public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : nums){
            if(num> max){
                secondMax = max;
                max = num;
            }
            else if(num > secondMax) secondMax = num;
        }
        return (max - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray = new MaximumProductOfTwoElementsInAnArray();
        System.out.println(maximumProductOfTwoElementsInAnArray.maxProduct(new int[]{3,4,5,2}) == 12 ? "Test passed" : "Test failed");
        System.out.println(maximumProductOfTwoElementsInAnArray.maxProduct(new int[]{1, 5, 4, 5}) == 16 ? "Test passed" : "Test failed");
        System.out.println(maximumProductOfTwoElementsInAnArray.maxProduct(new int[]{3,7}) == 12 ? "Test passed" : "Test failed");
    }
}

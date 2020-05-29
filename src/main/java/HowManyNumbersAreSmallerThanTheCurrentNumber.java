import java.util.ArrayList;
import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        ArrayList<Integer> outputArray = new ArrayList<>();
        int numbersSmallerThanCurrentNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            for (int j = 0; j < nums.length ; j++) {
                if (currentNumber > nums[j]) {
                    numbersSmallerThanCurrentNumber++;
                }
            }
            outputArray.add(numbersSmallerThanCurrentNumber);
            numbersSmallerThanCurrentNumber = 0;
        }
        return outputArray.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber
                = new HowManyNumbersAreSmallerThanTheCurrentNumber();

        System.out.println(Arrays.equals(howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}), new int[]{4, 0, 1, 1, 3}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}), new int[]{4, 0, 1, 1, 3}) ? "Test passed" : "Test failed");

    }

}

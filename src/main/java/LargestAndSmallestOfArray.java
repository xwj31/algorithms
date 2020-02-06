import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndSmallestOfArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 56, 76, 89, 100, 343, 21, 234));
        int largestNumber = list.get(0);
        int smallestNumber = list.get(0);

        for (Integer integer : list) {
            if (integer > largestNumber) {
                largestNumber = integer;
            } else if (integer < smallestNumber) {
                smallestNumber = integer;
            }
        }

        System.out.println("Smallest number is: " + smallestNumber);
        System.out.println("Largest number is: " + largestNumber);
    }
}

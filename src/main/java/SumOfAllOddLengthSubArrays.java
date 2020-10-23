import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllOddLengthSubArrays {

    public int sumOddLengthSubarrays(int[] arr) {

        List<Integer> workingList = new ArrayList<>();

        List<Integer> inputList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        //add all singles
        workingList.add(Arrays.stream(arr).sum());

        int currentIndex = inputList.size();
        for (int i = 0; i < inputList.size(); i++) {
            if (isOdd(currentIndex)) {
                workingList.add(inputList.stream().reduce(0, Integer::sum));
            }
            currentIndex--;
            inputList.remove(currentIndex);
        }
        return workingList.stream().reduce(0, Integer::sum);
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        SumOfAllOddLengthSubArrays sumOfAllOddLengthSubArrays = new SumOfAllOddLengthSubArrays();
        System.out.println(sumOfAllOddLengthSubArrays.sumOddLengthSubarrays(new int[]{1,4,2,5,3}) == 58 ? "Test passed" : "Test failed");
        System.out.println(sumOfAllOddLengthSubArrays.sumOddLengthSubarrays(new int[]{1,2}) == 3 ? "Test passed" : "Test failed");
        System.out.println(sumOfAllOddLengthSubArrays.sumOddLengthSubarrays(new int[]{10,11,12}) == 66 ? "Test passed" : "Test failed");
    }
}

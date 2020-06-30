import java.util.Arrays;

public class MaxOfArray {

    long solution(long[] numbers){

        if (numbers.length == 0) {
            return 0;
        }
        return Arrays.stream(numbers).max().getAsLong();
    }

    public static void main(String[] args) {
        MaxOfArray maxOfArray = new MaxOfArray();
        System.out.println(maxOfArray.solution(new long[]{7, 2, 6, 3}) == 7 ? "Test passed" : "Test failed");
        System.out.println(maxOfArray.solution(new long[]{}) == 0 ? "Test passed" : "Test failed");
    }


}

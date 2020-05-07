import org.w3c.dom.ls.LSOutput;

public class Numbers {

    public long solution(long[] numbers) {

        long largestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.solution(new long[]{7,2,6,3}) == 7 ? "Test passed" : "Test failed");
    }
}

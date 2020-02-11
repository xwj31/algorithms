import java.util.*;
import java.util.stream.IntStream;

public class TapeEquilibrium {

    public int solution(int[] A) {

        int sumLeftSide = 0;
        int sumRightSide = 0;
        ArrayList<Integer> workingList = new ArrayList<>();

        for (int i = 1; i < A.length; i++) {

            int j;
            for (j = 0; j < i; j++) {
                sumLeftSide += A[j];
            }

            for (int k = j; k < A.length; k++) {
                sumRightSide += A[k];
            }

            workingList.add(Math.abs(sumLeftSide - sumRightSide));
            sumLeftSide = 0;
            sumRightSide = 0;
        }
        return workingList.stream().min(Integer::compare).get();
    }


    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        System.out.println(tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}) == 1 ? "Test passed" : "Test failed "+tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(tapeEquilibrium.solution(new int[]{1,2}) == 1 ? "Test passed": "Test failed");
    }

}

import java.util.*;

public class PermMissingElem {

    public int solution(int[] A) {

        int sum = Arrays.stream(A).sum();
        int total = (A.length+1) * (A.length+2) / 2;
        return total - sum;
    }


    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        System.out.println(permMissingElem.solution(new int[]{2,3,1,5}) == 4 ? "Test passed" : "Test failed " + permMissingElem.solution(new int[]{2,3,1,5}));
    }
}

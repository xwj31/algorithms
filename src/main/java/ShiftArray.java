
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//12% solution, needs to be improved
public class ShiftArray {

    public int[] solution(int[] A, int K) {

        if(K == A.length) {
            return A;
        }

        LinkedList<Integer> linkedList =
                Arrays.stream(A).boxed().collect(Collectors.toCollection(LinkedList::new));

        linkedList.addAll(Arrays.stream(A).boxed().collect(Collectors.toCollection(LinkedList::new)));

        return IntStream.range(0, A.length).map(i -> linkedList.get(i + K-1)).toArray();

    }

    public static void main(String[] args) {

        ShiftArray shiftArray = new ShiftArray();

        if (Arrays.equals(shiftArray.solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8})) {
            System.out.println("test passed");
        } else{
            System.out.println("test failed");
        }

        if (Arrays.equals(shiftArray.solution(new int[]{1,2,3,4}, 4), new int[]{1,2,3,4})) {
            System.out.println("test passed");
        } else{
            System.out.println("test failed");
        }

        if (Arrays.equals(shiftArray.solution(new int[]{0,0,0}, 1), new int[]{0, 0, 0})) {
            System.out.println("test passed");
        } else{
            System.out.println("test failed");
        }
    }
}

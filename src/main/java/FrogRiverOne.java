import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {

    public int solution(int X, int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        int goal = X + 1;

        for (int i = 0; i < goal; i++) {
            map.put(i, A[i]);
        }

        int max = map.keySet().stream().max(Integer::compare).get();

        return map.get(max);
    }

    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        System.out.println(frogRiverOne.solution(5, new int[]{1,3, 1, 4, 2, 3, 5, 4}) == 6 ? "Test passed": "Test failed");

    }



}

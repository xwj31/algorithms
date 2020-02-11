import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static int solution(int N){

        String binaryString = Integer.toBinaryString(N);

        List<Integer> integerList = new ArrayList();
        int charGapCounter = 0;
        for (char c: binaryString.toCharArray()){
            if (c == '0'){
                charGapCounter++;
            } else {
                integerList.add(charGapCounter);
                charGapCounter = 0;
            }
        }

        return integerList.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}

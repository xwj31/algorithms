import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> workingList = new ArrayList<>();
        int currentMinimumOfRow;
        int currentMaximumOfColumn = 0;

        for (int i = 0; i < matrix.length; i++) {

            currentMinimumOfRow = Arrays.stream(matrix[i]).min().getAsInt();

            for (int j = 0; j < matrix[i].length; j++) {

                currentMaximumOfColumn = matrix[i][j];

               if (matrix[i][j] > currentMaximumOfColumn) {
                   currentMaximumOfColumn = matrix[i][j];
                   if (currentMaximumOfColumn == currentMinimumOfRow) {
                       workingList.add(currentMaximumOfColumn);
                   }
               }
            }
        }

        return workingList;
    }

    public static void main(String[] args) {

        LuckyNumbersInAMatrix luckyNumbersInAMatrix = new LuckyNumbersInAMatrix();
        //System.out.println(Objects.equals(luckyNumbersInAMatrix.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}), new int[]{15}) ? "Test passed" : "Test failed");
        System.out.println(Objects.equals(luckyNumbersInAMatrix.luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}), new int[]{12}) ? "Test passed" : "Test failed");
    }
}

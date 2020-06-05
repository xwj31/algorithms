import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountLargestGroup {

    public int countLargestGroup(int n ) {

        List<List<Integer>> workingList = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            //IntStream chars = String.valueOf(i).chars();
            int[] workingArray = String.valueOf(i).chars().map(Character::getNumericValue).toArray();
            if (workingArray.length > 1) {
                int sum = Arrays.stream(workingArray).sum();
                if (!workingList.contains(sum)) {
                    //workingList.add(sum);
                }
            } else if(!workingList.contains(i)){
                //workingList.add(i);
            }
        }
        return workingList.size();
    }

    public static void main(String[] args) {
        CountLargestGroup countLargestGroup = new CountLargestGroup();
        System.out.println(countLargestGroup.countLargestGroup(13) == 4 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(2) == 2 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(15) == 6 ? "Test passed" : "Test failed");
        System.out.println(countLargestGroup.countLargestGroup(24) == 5 ? "Test passed" : "Test failed");
    }

}

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatestNumberOfCandies = Arrays.stream(candies).max().getAsInt();

        ArrayList<Boolean> workingArray = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatestNumberOfCandies) {
                workingArray.add(true);
            } else {
                workingArray.add(false);
            }
        }
        return workingArray;
    }

    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        System.out.println(kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{2,3,5,1,3},3).equals(new ArrayList<>(Arrays.asList(true, true, true, false, true))));
        System.out.println(kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{4,2,1,1,2},1).equals(new ArrayList<>(Arrays.asList(true, false, false, false, false))));
        System.out.println(kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{12,1,12},10).equals(new ArrayList<>(Arrays.asList(true, false, true))));
    }
}

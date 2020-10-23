import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {


    public int specialArray(int[] nums) {

      //  ArrayList<Integer> workingList = Arrays.stream(nums).boxed().collect(Collectors.toList());

       // if( nums)





        return -1;
    }


    public static void main(String[] args) {
        SpecialArrayWithXElementsGreaterThanOrEqualX specialArrayWithXElementsGreaterThanOrEqualX = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        System.out.println(specialArrayWithXElementsGreaterThanOrEqualX.specialArray(new int[]{3, 5}) == 2 ? "test passed" : "test failed");
        System.out.println(specialArrayWithXElementsGreaterThanOrEqualX.specialArray(new int[]{0, 0}) == -1 ? "test passed" : "test failed");
        System.out.println(specialArrayWithXElementsGreaterThanOrEqualX.specialArray(new int[]{0, 4, 3, 0, 4}) == 3 ? "test passed" : "test failed");
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortedArray {


    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return nums1;
        }

        int[] result = Arrays.stream(nums1, 0, nums2.length).toArray();


        return Stream.of(result, nums2).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}

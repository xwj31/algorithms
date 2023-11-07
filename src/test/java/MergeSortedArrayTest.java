
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray;
    static Stream<Arguments> testCases() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 2, new int[]{1, 2, 2, 3, 5, 6}),
                arguments(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6})
        );
    }

    @BeforeEach
    public void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @ParameterizedTest(name = "{arguments}")
    @MethodSource("testCases")
    public void testMergeSortedArray(int[] nums1, int m, int[] nums2, int n, int[] expected){
        Assertions.assertArrayEquals(expected, mergeSortedArray.merge(nums1, m, nums2, n));
    }

}
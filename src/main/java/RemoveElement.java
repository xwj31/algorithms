import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        nums = Arrays.stream(nums).filter(e -> e != val).toArray();
        return nums.length;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{3,2,2,3}, 3) == 2 ? "Test passed" : "Test failed");
        System.out.println(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2) == 5 ? "Test passed" : "Test failed");
    }
}

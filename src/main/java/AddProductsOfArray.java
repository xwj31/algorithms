import java.util.Arrays;

/**
 *
 * I had a really fun interview recently where the coding exercise was to write the function:Return the product of all
 * values in an array except the current index.Input - [5, 6, 3, 2]Expected Output - [36, 30, 60, 90]
 */

public class AddProductsOfArray {

    public int[] addProductsOfArray(int[] array) {

    }

    public static void main(String[] args) {
        AddProductsOfArray addProductsOfArray = new AddProductsOfArray();
        System.out.println(Arrays.equals(addProductsOfArray.addProductsOfArray(new int[]{5, 6, 3, 2}), new int[]{36, 30, 60, 90}) ? "Test passed" : "Test failed");
    }
}

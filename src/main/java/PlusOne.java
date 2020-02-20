import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int count = 0;
        int[] sc = new int[digits.length + 1];
        sc[0] = 1;

        if (digits[digits.length - 1] == 9){
            digits[digits.length - 1] = 0;
            for(int i = digits.length - 2; i >= 0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    count++;
                }
                else{
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
            if(count == digits.length - 1) {
                return sc;
            }
        }
        else
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.equals(plusOne.plusOne(new int[]{1,2,3}), new int[]{1,2,4}) ? "Test passed" : "Test failed");
        System.out.println(Arrays.equals(plusOne.plusOne(new int[]{4,3,2,1}), new int[]{4,3,2,2}) ? "Test passed" : "Test failed");
    }
}

import java.util.Arrays;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        if (s.isEmpty()) {
            return true;
        }

        char[] charArray = s.toLowerCase().trim().toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        return (Arrays.equals(stringBuilder.toString().toCharArray(), charArray));
    }


    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama") ? "Test passed" : "Test failed");
        System.out.println(validPalindrome.isPalindrome("race a car") ? "Test passed" : "Test failed");
    }
}

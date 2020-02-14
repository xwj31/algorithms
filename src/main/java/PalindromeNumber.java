import java.util.ArrayList;

public class PalindromeNumber {

    public boolean solution(int x) {
        if (Integer.signum(x) == -1) {
            return false;
        }

        ArrayList<Integer> workingArray = new ArrayList<>();
        while (x > 0) {
            workingArray.add(x % 10);
            x = x / 10;
        }
        return isPalindrome(workingArray);
    }

    private static boolean isPalindrome(ArrayList<Integer> value){
        if (null == value)
            return true;
        for (int i = 0; i < value.size() / 2; ++i)
            if (value.get(i) != value.get(value.size() - 1 - i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.solution(121) ? "Test passed" : "Test failed");
        System.out.println(!palindromeNumber.solution(-121) ? "Test passed" : "Test failed");
        System.out.println(!palindromeNumber.solution(10) ? "Test passed": "Test failed");
    }
}

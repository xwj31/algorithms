import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {

        String[] words = s.split(" ");
        List<String> outputArray = new ArrayList<>();

        for (String word : words) {
            StringBuilder input = new StringBuilder();
            input.append(word).reverse();
            outputArray.add(input.toString());
        }

        return String.join(" ", outputArray);
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();
        System.out.println(reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest").equals("s'teL ekat edoCteeL tsetnoc") ? "Test passed" : "Test failed");
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInAnArray {

    //TODO: not working

    public List<String> stringMatching(String[] words) {

        List<String> res = new ArrayList<>();
        if(words == null || words.length == 0) {
            return res;
        }

        Arrays.sort(words);

        for(int i=0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                int idx = words[j].indexOf(words[i]);
                if(idx != -1) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;

    }


    public static void main(String[] args) {
        StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"mass","as", "hero", "superhero"}).equals(List.of("as", "hero")) ? "Test passed" : "Test failed");
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"leetcode","et", "code"}).equals(List.of("et", "code")) ? "Test passed" : "Test failed");
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"blue","green", "bu"}).equals(List.of()) ? "Test passed" : "Test failed");
    }
}

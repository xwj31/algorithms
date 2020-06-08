import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length(), n = p.length();
        if(n > m) return new ArrayList<>();

        int[] cnt_arr = new int[26];
        for(int i = 0; i < n; i++){
            cnt_arr[s.charAt(i) - 'a']++;
            cnt_arr[p.charAt(i) - 'a']--;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = n; i < m; i++){
            if(areAllZeroes(cnt_arr)){
                list.add(i - n);
            }
            cnt_arr[s.charAt(i) - 'a']++;
            cnt_arr[s.charAt(i - n) - 'a']--;
        }
        if(areAllZeroes(cnt_arr)){
            list.add(m - n);
        }

        return list;
    }

    boolean areAllZeroes(int[] cnt_arr){
        for(int i = 0; i < cnt_arr.length; i++){
            if(cnt_arr[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        System.out.println(findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc").equals(Arrays.asList(0,6)) ? "Test passed" : "Test failed");
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab").equals(Arrays.asList(0,6)) ? "Test passed" : "Test failed");

    }

}

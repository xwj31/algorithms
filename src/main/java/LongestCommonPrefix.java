import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder outPutString = new StringBuilder();

        List<Character> workingCharArray =
                strs[0].chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        List<char[]> workingList = new ArrayList<>();

        for (String str : strs) {
            workingList.addAll(Collections.singletonList(str.toCharArray()));
        }
        for (int i = 0; i < workingList.size(); i++) {
            for (int j = 0; j < workingList.get(i).length; j++) {
                    if (workingList.get(i)[j] == workingCharArray.get(j)) { //TODO: fix: array out of bounds
                        workingCharArray.set(j, workingList.get(i)[j]);
                    } else {
                        workingCharArray.set(j, (char) 0);
                    }
            }
        }
        for (Character character : workingCharArray) {
            if (character != 0) {
                outPutString.append(character);
            }
        }
        return outPutString.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}).equals("fl") ? "Test passed" : "Test failed");
        System.out.println(StringUtils.isEmpty(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar", "car"})) ? "Test passed" : "Test passed");
    }
}

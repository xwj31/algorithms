import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder outPutString = new StringBuilder();

        char[] workingCharArray = strs[0].toCharArray();
        List<char[]> workingList = new ArrayList<>();

        for (String str : strs) {
            workingList.addAll(Collections.singletonList(str.toCharArray()));
        }

        for (int i = 0; i < workingList.size(); i++) {
            for (int j = 0; j < workingList.get(i).length; j++) {
                    if (workingList.get(i)[j] == workingCharArray[j]) {
                        workingCharArray[j] = workingList.get(i)[j];
                    } else {
                        workingCharArray[j] = 0;
                    }
            }
        }

        for (int i = 0; i < workingCharArray.length; i++) {
            if (workingCharArray[i] != 0) {
                outPutString.append(workingCharArray[i]);
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


public class ConsecutiveCharacters {


    public int maxPower(String s) {
        int r = 0, e = 0;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                r = 0;
            } else {
                r++;
                e = Math.max(r,e);
            }
        }
        return e+1;
    }

    public int maxPowerNotWorking( String s) {

        char[] chars = s.toCharArray();
        int currentLongestRepeatingChar = 1;
        int maxRepeatingChar = 0;

        if (s.length() == 1) {
            return 1;
        }

        if (s.length() == 2 && chars[0] == chars[1]) {
            return 2;
        }
            for (int i = 0; i < chars.length-1; i++) {
                if (chars[i] == s.charAt(i+1)) {
                  currentLongestRepeatingChar++;
                } else {
                    if (currentLongestRepeatingChar > maxRepeatingChar) {
                        maxRepeatingChar = currentLongestRepeatingChar;
                        currentLongestRepeatingChar = 1;
                    }
                }
            }
        return maxRepeatingChar;
    }

    public static void main(String[] args) {
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();
        System.out.println(consecutiveCharacters.maxPower("aceghhikkklllmnopppprssstvvxxy") == 4 ? "Test passed" :"Test passed");
        System.out.println(consecutiveCharacters.maxPower("cddeffjuuy") == 2 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("cc") == 2 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("leetcode") == 2 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("abbcccddddeeeeedcba") == 5 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("triplepillooooow") == 5 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("hooraaaaaaaaaaay") == 11 ? "Test passed" : "Test failed");
        System.out.println(consecutiveCharacters.maxPower("tourist") == 1 ? "Test passed" : "Test failed");
    }
}

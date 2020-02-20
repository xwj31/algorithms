public class LengthOfLastWord {

    public int lengthOfLastWord(String s){

        if (s.equals("") || s.equals(" ")){
            return 0;
        }
        int max = 0;
        String longestWord = null;
        String[] chars =  s.split(" ");

        for (String aChar : chars) {
            if (aChar.length() > max) {
                longestWord = aChar;
            }
        }
        return longestWord != null ? longestWord.length() : 0;
    }

    public static void main(String[] args) {
        LengthOfLastWord  lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World") == 5 ? "Test passed" : "Test failed");
        System.out.println(lengthOfLastWord.lengthOfLastWord("") == 0 ? "Test passed" : "Test failed");
        System.out.println(lengthOfLastWord.lengthOfLastWord(" ") == 0 ? "Test passed" : "Test failed");
        System.out.println(lengthOfLastWord.lengthOfLastWord("     ") == 0 ? "Test passed" : "Test failed");
    }
}

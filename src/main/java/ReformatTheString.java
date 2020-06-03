public class ReformatTheString {

    public String reformat(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (isNumeric(chars[i]) && isNumeric(chars[i+1])) {

            }
        }
        return s;
    }

    public static boolean isNumeric(char str) {
        try {
            Double.parseDouble(String.valueOf(str));
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static char[] swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void main(String[] args) {
        ReformatTheString reformatTheString = new ReformatTheString();
        System.out.println(reformatTheString.reformat("a0b1c2").equals("a0b1c2") ? "Test passed" : "Test failed");
        System.out.println(reformatTheString.reformat("leetcode").equals("") ? "Test passed" : "Test failed");
        System.out.println(reformatTheString.reformat("1229857369").equals("") ? "Test passed" : "Test failed");
    }
}

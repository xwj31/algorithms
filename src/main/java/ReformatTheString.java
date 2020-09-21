import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReformatTheString {

    public String reformat(String s) {

        if(s == null || s.length()<=1)
            return s;
        List<Character> digits = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) digits.add(c);
            else chars.add(c);
        }
        if(Math.abs(digits.size()-chars.size()) >= 2) return "";

        StringBuilder sb = new StringBuilder();
        boolean digitOrChar = digits.size() >= chars.size();
        for(int i = 0; i<s.length(); i++){
            if(digitOrChar)
                sb.append(digits.remove(0));
            else
                sb.append(chars.remove(0));
            digitOrChar = !digitOrChar;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReformatTheString reformatTheString = new ReformatTheString();
        System.out.println(reformatTheString.reformat("ab123").equals("3b2a1") ? "test passed" : "test failed");
        System.out.println(reformatTheString.reformat("covid2019").equals("") ? "test passed" : "test failed");
        System.out.println(reformatTheString.reformat("a0b1c2").equals("a0b1c2") ? "Test passed" : "Test failed");
        System.out.println(reformatTheString.reformat("leetcode").equals("") ? "Test passed" : "Test failed");
        System.out.println(reformatTheString.reformat("1229857369").equals("") ? "Test passed" : "Test failed");
    }
}

public class FindClosingParentheses {

    public long solution( String parentheses, long index) {

        char[] text = parentheses.toCharArray();
        int closePos = (int) index;
        int counter = 1;
        while (counter > 0) {
            char c = text[++closePos];
            if (c == '(') {
                counter++;
            }
            else if (c == ')') {
                counter--;
            }
        }
        return closePos;
        }

    public static void main(String[] args) {
        FindClosingParentheses findClosingParentheses = new FindClosingParentheses();
        System.out.println(findClosingParentheses.solution("((())())", 1) == 4 ? "Test passed" : "Test failed");
    }
}

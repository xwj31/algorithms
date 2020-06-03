public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {

        long highestCount = 0;
        long leftCount;
        long rightCount;

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);

            leftCount = left.chars().filter(ch -> ch == '0').count();
            rightCount = right.chars().filter(ch -> ch == '1').count();

            if (leftCount+rightCount>highestCount) {
                highestCount = leftCount+rightCount;
            }
        }
        return (int) highestCount;
    }

    public static void main(String[] args) {
        MaximumScoreAfterSplittingAString maximumScoreAfterSplittingAString = new MaximumScoreAfterSplittingAString();
        System.out.println(maximumScoreAfterSplittingAString.maxScore("011101") == 5 ? "Test passed" : "Test failed");
        System.out.println(maximumScoreAfterSplittingAString.maxScore("00111") == 5 ? "Test passed" : "Test failed");
        System.out.println(maximumScoreAfterSplittingAString.maxScore("1111") == 3 ? "Test passed" : "Test failed");
        System.out.println(maximumScoreAfterSplittingAString.maxScore("00") == 1 ? "Test passed" : "Test failed");
    }
}

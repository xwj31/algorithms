public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int numberOfValleys = 0;
        boolean inValley = false;

        Integer level = 0;

        char[] charArray = s.toCharArray();
        for (char character: charArray) {
             if (character == 'D') {
                level--;
                if (Integer.signum(level) < 0) {
                    inValley = true;
                }
            } else if (character == 'U') {
                level++;
                if (Integer.signum(level) == 0 && inValley) {
                    numberOfValleys++;
                    inValley = false;
                }
            }
        }

        return numberOfValleys;
    }


    public static void main(String[] args) {

        int result = countingValleys(8, "UDDDUDUU");
        if (result == 1) {
            System.out.println("test passed");
        } else {
            System.out.println("Failed: "+result);
        }
    }

}

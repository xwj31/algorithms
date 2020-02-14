public class RomanToInteger {

    public int romanToInt(String s) {

        int number = 0;
        int pre = 0;

        if (s == null) {
            return 0;
        }

        char[] workingArray = s.toCharArray();

        for (int i = workingArray.length - 1; i >= 0; i--) {
            int current = romanChars(workingArray[i]);

            if (i == workingArray.length - 1) {
                number = number + current;
            } else {
                if (current < pre) {
                    number = number - current;
                } else {
                    number = number + current;
                }
            }
            pre = current;
        }

        return number;
    }

        public int romanChars(char c) {
            int number;
            switch (c) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
                default:
                    number = 0;
                    break;
            }
            return number;
        }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III") == 3 ? "Test passed" : "Test failed");
        System.out.println(romanToInteger.romanToInt("IV") == 4 ? "Test passed" : "Test failed");
        System.out.println(romanToInteger.romanToInt("IX") == 9 ? "Test passed" : "Test failed");
        System.out.println(romanToInteger.romanToInt("LVIII") == 58 ? "Test passed" : "Test failed");
        System.out.println(romanToInteger.romanToInt("MCMXCIV") == 1994 ? "Test passed" : "Test failed");
    }
}

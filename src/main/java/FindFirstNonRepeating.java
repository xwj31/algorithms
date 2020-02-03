public class FindFirstNonRepeating {

    private static void findFirstNonRepeatingCharacter(String inputString) {

        for (Character character: inputString.toCharArray()) {
            if (inputString.indexOf(character) == inputString.lastIndexOf(character)) {
                System.out.println("First non repeating character: " + character);
                break;
            }
        }
    }

    public static void main(String[] args) {
        findFirstNonRepeatingCharacter("hello");
    }
}

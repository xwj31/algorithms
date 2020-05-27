
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++)
            if(arr[i].indexOf(searchWord)==0) return i+1;
        return -1;
    }

    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence checkIfAWordOccursAsAPrefixOfAnyWordInASentence = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord("i love eating burger", "burg") == 4 ? "Test passed" :"Test failed");
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord("this problem is an easy problem", "pro") == 2 ? "Test passed" : "Test failed");
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord("i am tired", "you") == -1 ? "Test passed" : "Test failed");
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord("i use triple pillow", "pill") == 4 ? "Test passed" : "Test failed");
        System.out.println(checkIfAWordOccursAsAPrefixOfAnyWordInASentence.isPrefixOfWord("hello from the other side", "they") == -1 ? "Test passed" : "Test failed");
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithStack {

    public List<String> buildArray(int[] target, int n) {

        List<String> ans= new ArrayList<>();

        //Loop through the numbers from 1..n (inclusive)
        for(int i=1,x=0; i<=n; i++){
            //Since this is a stack, always push the number
            ans.add("Push");
            //Pop the number if not in target array
            if(target[x]!=i){
                ans.add("Pop");
            }
            //Increment pointer of target array if element found
            else {
                x++;
            }
            //Break the loop if target array traversed
            if(x==target.length) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayWithStack arrayWithStack = new ArrayWithStack();
        System.out.println(arrayWithStack.buildArray(new int[]{1, 3}, 3).equals(Arrays.asList("Push", "Push", "Pop","Push")) ? "Test passed": "Test failed");
        System.out.println(arrayWithStack.buildArray(new int[]{2, 3, 4}, 4).equals(Arrays.asList("Push","Pop", "Push", "Push","Push")) ? "Test passed": "Test failed");
        System.out.println(arrayWithStack.buildArray(new int[]{1, 2}, 4).equals(Arrays.asList("Push", "Push")) ? "Test passed": "Test failed");
        System.out.println(arrayWithStack.buildArray(new int[]{1, 2, 3}, 3).equals(Arrays.asList("Push", "Push", "Push")) ? "Test passed": "Test failed");
    }

}

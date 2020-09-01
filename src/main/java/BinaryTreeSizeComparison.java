import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 <p>Suppose you're given a binary tree represented as an array. For example, [3,6,2,9,-1,10] represents the following binary tree (where -1 is a non-existent node):</p>
 <p><img src="https://s3-us-west-2.amazonaws.com/py-company-images/binary_tree.png" alt="enter image description here"></p>
 <p>Write a function that determines whether the left or right branch of the tree is larger.
 The size of each branch is the sum of the node values. The function should return the string <code>"Right"</code>
 if the right side is larger and <code>"Left"</code> if the left side is larger.  If the tree has <code>0</code> nodes or if the size of
 the branches are equal, return the empty string.</p>

 <p>Example Input:</p>
 <pre><code>[3,6,2,9,-1,10]
 </code></pre>
 <p>Example Output:</p>
 <pre><code>Left
 </code></pre>

 */

public class BinaryTreeSizeComparison {

    public String solution(long[] arr) {

        long leftSideSize = 0;
        long rightSideSize = 0;

        for (int i = 0; i < arr.length; i++) {
            leftSideSize = leftSideSize + arr[2*i+1];
            rightSideSize = rightSideSize + arr[2*i+2];
        }

        return "null";
    }

    public static void main(String[] args) {
        BinaryTreeSizeComparison binaryTreeSizeComparison = new BinaryTreeSizeComparison();
        System.out.println(binaryTreeSizeComparison.solution(new long[]{3,6,2,9,-1,10}).equals("Left") ? "Test passed" : "Test failed");
    }
}

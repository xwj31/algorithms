import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println();
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        while (head != null) {
            if (visitedNodes.contains(head)) {
                return true;
            } else {
                visitedNodes.add(head);
            }
            head = head.next;
        }
        return false;
    }


    class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }
}

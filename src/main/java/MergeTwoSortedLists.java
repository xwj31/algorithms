
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){


        return new ListNode(1);
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1);
        l1.setNext(new ListNode(2));


/*
        System.out.println(mergeTwoSortedLists.mergeTwoLists(new ListNode(1)
                .setNext(new ListNode(2)
                        .setNext(new ListNode(4)
                                ,new ListNode(1)
                                        .setNext(new ListNode(3)
                                                .setNext(new ListNode(4)))))));

 */

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}

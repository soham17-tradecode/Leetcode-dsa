public class linkedlist142 {

    static ListNode cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;


            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        return slow;


    }

    public static void main(String[] args) {
        ListNode s1 = new ListNode(3);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(0);
        ListNode s4 = new ListNode(-4);

        //create link --->
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        //create a cycle to return true--->
        s4.next = s2;


        ListNode result = cycle(s1);
        System.out.println(result.data);

    }
}

class ListNode {
    ListNode next;
    int data;

    ListNode(int data) {
        this.data = data;
        this.next = null;

    }


}

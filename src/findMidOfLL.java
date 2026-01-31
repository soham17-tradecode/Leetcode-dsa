public class findMidOfLL {
    static ListNode mid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }



    public static void main(String[] args) {

        ListNode s1 = new ListNode(3);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(5);
        ListNode s4 = new ListNode(-4);

        //create link --->
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        //create a cycle to return true--->
//        s4.next = s2;

        ListNode res = mid(s1);

        System.out.println(res.data);


    }
}




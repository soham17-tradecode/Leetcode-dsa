public class linkedListCycle {


    static boolean hasCycle(LinkedList head)
    {
        LinkedList slow = head;
        LinkedList fast= head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedList s1 = new LinkedList(3);
        LinkedList s2 = new LinkedList(2);
        LinkedList s3 = new LinkedList(0);
        LinkedList s4 = new LinkedList(-4);

        //create link --->
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;

        //create a cycle to return true--->
        s4.next = s2;


        System.out.println( hasCycle(s1));
//


    }
}

class LinkedList{

    int data;
    LinkedList next;

    LinkedList(int data)
    {
        this.data = data;
        this.next = null;
    }
}

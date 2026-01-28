//public class linkedlist {
//    public static void main(String[] args) {
//        Singly ll = new Singly();
//        ll.insert(10);
//        ll.insert(20);
//        ll.insert(30);
//
//        ll.delete(30);
//
//
//
//        ll.display();
//
//    }
//}
//
//class node {
//    int data;
//    node next;
//
//    node(int val) {
//        this.data = val;
//        this.next = null;
//    }
//}
//
//
//class Singly {
//
//    node head;
//
//    void insert(int data) {
//        node newNode = new node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//
//        node temp = head;
//        while (temp.next != null) {
//                temp = temp.next;
//        }
//        temp.next = newNode;
//
//
//    }
//    void delete(int key)
//    {
//        if (head == null) return;
//        node temp = head;
//
//
//        if (head.data == key)
//        {
//            head = head.next;
//            return;
//        }
//
//        while(temp.next!=null && temp.next.data!=key)
//        {
//            temp = temp.next;
//        }
//
//        if (temp.next != null) {
//            System.out.println("deleted node :"+temp.next.data);
//            temp.next = temp.next.next;
//
//        }
//
//    }
//
//
//    void display()
//    {
//        node temp = head;
//        while(temp!=null)
//        {
//            System.out.print(temp.data+" -> ");
//            temp = temp.next;
//
//        }
//        System.out.println("null");
//    }
//
//}

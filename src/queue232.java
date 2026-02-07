import java.util.Stack;

public class queue232 {

    public static void main(String[] args) {
        myQueue myQueue = new myQueue();
        myQueue.push(4);

        int param1 = myQueue.peek();
        int param2 = myQueue.pop();
        boolean param3 = myQueue.empty();


        System.out.println(param1);
        System.out.println(param2);
        System.out.println(param3);

    }

}

class myQueue{

    Stack<Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();

    public myQueue() {

    }

    public void push(int x) {
        while(!s1.isEmpty())
        {
            int data = s1.pop();
            s2.push(data);
        }

        s1.push(x);
        while(!s2.isEmpty())
        {
            int data = s2.pop();
            s1.push(data);
        }

    }

    public int pop()
    {
        return s1.pop();

    }

    public int peek()
    {
        return  s1.peek();

    }

    public boolean empty() {
        return   s1.isEmpty();

    }
}

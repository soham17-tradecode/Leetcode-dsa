import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue622 {
    public static void main(String[] args) {
        muQueue muQueue = new muQueue(3);
        muQueue.enQueue(4);
        muQueue.enQueue(5);
        muQueue.enQueue(6);
        muQueue.deQueue();
        System.out.println( muQueue.isFull());
        muQueue.Front();
        muQueue.Rear();

    }
}

class muQueue {
    ArrayList <Integer> list;
    int capacity;

    public muQueue(int k) {
        list = new ArrayList<>();
        this.capacity = k;

    }

    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }

        list.add(value);
        return true;
    }

    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        list.remove(0);
        return true;



    }

    public int Front() {
        return list.isEmpty() ?-1 : list.getFirst();


    }

    public int Rear() {
        return list.isEmpty() ? -1 : list.getLast();

    }

    public boolean isEmpty() {
        return list.isEmpty();

    }

    public boolean isFull() {
        return list.size() == capacity;

    }



}










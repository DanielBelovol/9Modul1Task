package Task3;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Hello first");
        myQueue.add("Hello second");
        myQueue.add("Hello third");

        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}

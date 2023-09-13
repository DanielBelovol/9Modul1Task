package Task4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Hello1");
        myStack.push("Hello2");
        myStack.push("Hello3");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}

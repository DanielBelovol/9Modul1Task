package Task2;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("thirt");
        linkedList.add("fourth");
        linkedList.add("five");

        linkedList.remove(0);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}

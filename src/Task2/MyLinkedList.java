package Task2;

import java.util.Objects;

public class MyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;
    public int size;

    public void add(T value){
        Node<T> node = new Node<>(value);

        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }


    public T get(int index){
        Objects.checkIndex(index, size);

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return  current.value;
    }



    static class Node<T>{
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(T value) {
            this.value = value;
        }
    }
}

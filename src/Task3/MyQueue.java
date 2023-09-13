package Task3;

import Task2.MyLinkedList;

public class MyQueue<T> {
    private int size;
    private Node<T> head;
    private Node<T>tail;
    static class Node<T>{
        T value;
        private Node<T> next;
        private Node<T> previous;


        public Node(T value) {
            this.value = value;
        }
    }

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

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public T peek(){
        return (T) head.value;
    }
    public T poll(){
        Node<T> current = head;
        try {
            return (T) current.value;
        }
        finally {
            head = current.next;
            if (head != null) {
                head.previous = null;
            }
        }
    }
}

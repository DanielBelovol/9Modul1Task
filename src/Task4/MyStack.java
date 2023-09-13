package Task4;

import Task2.MyLinkedList;
import Task3.MyQueue;

public class MyStack<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;
    static class Node<T>{
        T value;
        private Node<T> next;
        private Node<T> previous;


        public Node(T value) {
            this.value = value;
        }
    }

    public void push(T value){
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

    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            head = current.next;
            if (head != null) {
                head.previous = null;
            }
        }
        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
            if (tail != null) {
                tail.next = null;
            }
        }
        size--;
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
        return tail.value;
    }

    public T pop(){
        Node<T> current = tail;
        try{
            return(T) tail.value;
        }finally {
            tail = current.previous;
            if (tail != null) {
                tail.next = null;
            }
        }
    }
}

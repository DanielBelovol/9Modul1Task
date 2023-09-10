package Task1;

import java.util.Arrays;

public class MyArrayList <T> {
    private final static int DEFAULT_SIZE_OF_ARRAY = 10;

    private T[] container;
    private int size;

    public MyArrayList(){
        container = (T[]) new Object[DEFAULT_SIZE_OF_ARRAY];
        size = 0;
    }
    public void add(T value){
        try {
            container[size] = value;
            size++;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Container is full");
        }
    }
    public void remove(int index){
        container[index] = null;
        size--;
    }

    public void clear(){
        for(T element: container){
            container = null;
        }
    }
    public int size(){
        return container.length;
    }

    public T get(int index){
        return container[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(container);
    }
}

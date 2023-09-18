package Task1;

import java.util.Arrays;

public class MyArrayList <T> {
    private int defaultCapacity = 10;

    private T[] container;
    private int size;

    public MyArrayList(){
        container = (T[]) new Object[defaultCapacity];
        size = 0;
    }
    public void add(T value){
        if (size == container.length) {
            increaseCapacity();
        }
        container[size++] = value;

    }
    public void remove(int index){
        try {
            container[index] = null;
            try {
                for (int i = index; i < container.length - 1; i++) {
                    container[i] = container[i + 1];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return;
            }
            size--;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to remove");
        }
    }

    public void clear(){
        container=null;
    }
    public int size(){
        return container.length;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return container[index];
    }
    private void increaseCapacity() {
        int newCapacity = (int) ((int)container.length * 1.5);
        container = Arrays.copyOf(container, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(container);
    }
}

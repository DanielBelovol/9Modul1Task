package Task5;

import java.util.Arrays;

public class MyHashMap<K, V> {

    private static final int DEFAULT_SIZE = 16;
    private Entry<K, V>[] entries = new Entry[DEFAULT_SIZE];

    private int size = 0;

    public void put(K key, V value) {
        needToResize();
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value, null);
        if (entries[index] == null) {
            entries[index] = entry;
            size++;
        } else {

            Entry<K, V> current = entries[index];
            while (current.getNext() != null) {
                if (current.getKey().equals(key)) {

                    current.value = value;
                    return;
                }
                current = current.getNext();
            }

            current.next = entry;
            size++;
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = entries[index];

        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }

        // If key not found, return null
        return null;
    }


    public void clear() {
        for (int i = 0; i < entries.length; i++) {
            entries[i] = null;
        }
        size = 0;
    }

    public V remove(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = entries[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.getKey().equals(key)) {
                if (prev == null) {
                    entries[index] = current.getNext();
                } else {
                    prev.next = current.getNext();
                }
                size--;
                return current.getValue();
            }
            prev = current;
            current = current.getNext();
        }
        return null;
    }


    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }

    public void needToResize() {
        if (size >= entries.length * 0.75) {
            int newCapacity = entries.length * 2;
            entries = Arrays.copyOf(entries, newCapacity);
        }
    }


    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}

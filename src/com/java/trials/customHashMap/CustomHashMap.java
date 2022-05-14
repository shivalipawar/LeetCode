package com.java.trials.customHashMap;

public class CustomHashMap<K, V> {

    int capacity = 4;
    private Entry<K, V>[] table;

    public CustomHashMap() {
        table = new Entry[capacity];
    }

    public void put(K newKey, V value) {
        if (newKey == null)
            return;

        int hash = hash(newKey);
        Entry<K, V> newEntry = new Entry<>(newKey, value, null);
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(newKey)) {
                    if (previous == null) {
                        newEntry.next = current.next;
                        table[hash] = newEntry;
                        return;
                    }
                } else {
                    newEntry.next = current.next;
                    previous.next = newEntry;
                    return;
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    public V get(K key) {
        if (key == null)
            return null;
        int hash = hash(key);

        Entry<K, V> entry = table[hash];
        while (entry != null) {
            if (entry.key.equals(key))
                return entry.value;
            entry = entry.next;
        }
        return null;
    }

    public boolean remove(K key) {
        if (key == null)
            return false;
        int hash = hash(key);

        Entry<K, V> kvEntry = table[hash];
        Entry<K, V> prev = null;

        if (kvEntry == null)
            return false;

        while (kvEntry != null) {
            if (kvEntry.key.equals(key)) {
                if (prev == null) {
                    kvEntry = kvEntry.next;
                    table[hash] = kvEntry;
                    return true;
                } else {
                    prev.next = kvEntry.next;
                    kvEntry = kvEntry.next;
                    table[hash] = kvEntry;
                    return true;
                }
            }
            prev = kvEntry;
            kvEntry = kvEntry.next;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> kvEntry = table[i];
                while (kvEntry != null) {
                    System.out.println("Key :" + kvEntry.key + " Value :" + kvEntry.value);
                    kvEntry = kvEntry.next;
                }
            }
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
}

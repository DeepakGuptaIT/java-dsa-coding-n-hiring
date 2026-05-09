package com.firealgo.codingproblemsolvinginjava.askedInInterview.nc;

import java.util.LinkedHashMap;
import java.util.Map;

public class ImplementLRUCache {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        LRUCache2<Integer, String> cache = new LRUCache2<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.printCache();

        cache.get(1);  // Access key 1 to mark it as recently used

        cache.put(5, "E"); // Adds 4, removes least recently used (which is key 2)
        cache.get(3);
        cache.put(6, "F");

        cache.printCache();
    }

    private static void test1() {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println("Cache: " + cache);

        cache.get(1);  // Access key 1 to mark it as recently used
        cache.put(4, "D"); // Adds 4, removes least recently used (which is key 2)
        System.out.println("Cache after adding 4: " + cache);
    }
}

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // Enable access-order for LRU behavior
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Remove oldest entry if cache exceeds size
    }
}

class LRUCache2<K, V> {
    private final int capacity;
    private final LinkedHashMap<K, V> cache;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    // Get method (returns value if present, else null)
    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    // Put method (adds entry to cache)
    public void put(K key, V value) {
        cache.put(key, value);
    }

    // Display cache contents
    public void printCache() {
        System.out.println(cache);
    }

    public int getCapacity() {
        return capacity;
    }
}

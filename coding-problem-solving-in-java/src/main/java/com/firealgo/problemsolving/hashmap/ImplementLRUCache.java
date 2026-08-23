package com.firealgo.problemsolving.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implement LRU Cache using LinkedHashMap
 *
 * LRU = Least Recently Used
 *
 * Working:
 *
 * LinkedHashMap with accessOrder = true maintains entries based on
 * their access order.
 *
 * HEAD                                      TAIL
 *  ↓                                          ↓
 * [LRU] → [ ... ] → [ ... ] → [MRU]
 *   ↑                                      ↑
 * removed first                       most recently used
 *
 * - HEAD contains the least recently used (LRU) item.
 * - TAIL contains the most recently used (MRU) item.
 * - get() or put() on an existing key moves that key to the TAIL.
 * - When capacity is exceeded, the HEAD (LRU item) is removed.
 *
 * Example:
 *
 * Capacity = 3
 *
 * put(1, A), put(2, B), put(3, C)
 *
 * HEAD                         TAIL
 *  ↓                             ↓
 * [1] → [2] → [3]
 * LRU             MRU
 *
 * get(1)
 *
 * HEAD                         TAIL
 *  ↓                             ↓
 * [2] → [3] → [1]
 * LRU             MRU
 *
 * put(4, D)
 *
 * Capacity exceeded, so HEAD [2] is removed:
 *
 * HEAD                         TAIL
 *  ↓                             ↓
 * [3] → [1] → [4]
 * LRU             MRU
 *
 * Time:
 * - get(): O(1)
 * - put(): O(1)
 *
 * Space: O(capacity)
 */
public class ImplementLRUCache {

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println(cache);
        // {1=A, 2=B, 3=C}

        cache.get(1);
        // Key 1 is accessed, so it becomes MRU and moves to TAIL.

        System.out.println(cache);
        // {2=B, 3=C, 1=A}

        cache.put(4, "D");
        // Capacity exceeded.
        // Key 2 is LRU and is removed from HEAD.

        System.out.println(cache);
        // {3=C, 1=A, 4=D}

        cache.get(3);
        // Key 3 becomes MRU and moves to TAIL.

        System.out.println(cache);
        // {1=A, 4=D, 3=C}

        cache.put(5, "E");
        // Key 1 is now LRU and is removed.

        System.out.println(cache);
        // {4=D, 3=C, 5=E}
    }
}

/**
 * LRU Cache implementation using LinkedHashMap.
 */
class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {

        /*
         * accessOrder = true
         *
         * false -> insertion order
         * true  -> access order
         *
         * With accessOrder = true:
         * - Accessed entries move to the TAIL.
         * - The HEAD always contains the LRU entry.
         */
        super(capacity, 0.75f, true);

        this.capacity = capacity;
    }

    /**
     * Remove the eldest entry when cache exceeds its capacity.
     *
     * With accessOrder = true, the eldest entry is the
     * least recently used (LRU) entry.
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
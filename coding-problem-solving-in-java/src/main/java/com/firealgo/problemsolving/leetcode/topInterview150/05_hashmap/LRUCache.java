package com.firealgo.problemsolving.leetcode.problems.cache;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * <a href="https://leetcode.com/problems/lru-cache/solutions/">...</a>
 *
 */
class LRUCache {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(3);
        obj.put(2,20);
        obj.put(3,30);
        obj.put(4,40);
        obj.put(5, 50);
        obj.get(2);
        obj.get(7);
        obj.get(4);
        System.out.println(obj.cache);

    }
    LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        cache =
                new LinkedHashMap<>(capacity, .75f, true) {
                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//                        return super.removeEldestEntry(eldest);
                        return cache.size() > capacity;
                    }
                };

    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
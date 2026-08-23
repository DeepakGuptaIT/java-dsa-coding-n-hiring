package com.firealgo.problemsolving.hashmap.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    int capacity;


    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//        return super.removeEldestEntry(eldest);
        return this.capacity < this.size();
    }
}

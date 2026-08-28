package com.firealgo.javastreams.collection.sequencedCollection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

public class SequencedCollectionsDemo {

    public static void main(String[] args) {

        sequencedCollectionDemo();
        sequencedSetDemo();
        sequencedMapDemo();
    }

    /**
     * Demonstrates SequencedCollection.
     *
     * SequencedCollection provides a common API for collections
     * that have a defined encounter order.
     */
    private static void sequencedCollectionDemo() {

        System.out.println("\n--- SequencedCollection Demo ---");

        SequencedCollection<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Kafka");

        // Get the first and last elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // Add elements at the beginning and end
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After addFirst/addLast: " + list);

        // reversed() returns a reverse-order view
        System.out.println("Reversed: " + list.reversed());

        // Remove the first and last elements
        list.removeFirst();
        list.removeLast();

        System.out.println("After removeFirst/removeLast: " + list);
    }

    /**
     * Demonstrates SequencedSet.
     *
     * LinkedHashSet maintains insertion order and implements
     * the SequencedSet interface.
     */
    private static void sequencedSetDemo() {

        System.out.println("\n--- SequencedSet Demo ---");

        SequencedSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("Kafka");

        // Access the first and last elements
        System.out.println("First: " + set.getFirst());
        System.out.println("Last: " + set.getLast());

        // Get a reverse-order view
        System.out.println("Original: " + set);
        System.out.println("Reversed: " + set.reversed());
    }

    /**
     * Demonstrates SequencedMap.
     *
     * LinkedHashMap maintains insertion order and implements
     * the SequencedMap interface.
     */
    private static void sequencedMapDemo() {

        System.out.println("\n--- SequencedMap Demo ---");

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Kafka");

        // Access the first and last entries
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        // Get a reverse-order view of the map
        System.out.println("Original: " + map);
        System.out.println("Reversed: " + map.reversed());

        // Remove the first and last entries
        map.pollFirstEntry();
        map.pollLastEntry();

        System.out.println("After removing first and last: " + map);
    }
}
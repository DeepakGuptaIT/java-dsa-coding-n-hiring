package com.firealgo.javabasicconcept.core;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        	// ArrayList is backed by an array, while LinkedList is backed by a doubly linked list.
            // ArrayList provides fast random access to elements, while LinkedList provides fast insertion and deletion of elements.
            // ArrayList is more memory efficient than LinkedList, as it does not require additional memory for storing pointers to the next and previous elements.
        // ArrayList is better for storing and accessing large amounts of data, while LinkedList is better for scenarios where frequent insertion and deletion of elements is required.
        // In general, ArrayList is a better choice for most use cases, unless you specifically need the features provided by LinkedList.
        // example        // ArrayList example
        java.util.List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList: " + arrayList);
        // LinkedList example
        java.util.List<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("LinkedList: " + linkedList);
        linkedList.add(1, "W");

        // Arraylist common methods
        arrayList.get(0); // get element at index 0
        arrayList.set(0, "D"); // set element at index 0 to "D"
        arrayList.remove(1); // remove element at index 1


        // LinkedList common methods
        linkedList.get(0); // get element at index 0
        linkedList.set(0, "V"); // set element at index 0 to "V"
        linkedList.remove(1); // remove element at index 1
        // LinkedList specific methods
        linkedList.addFirst("U"); // add element at the beginning of the list
        linkedList.addLast("W"); // add element at the end of the list




    }
}

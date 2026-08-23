package com.firealgo.javabasicconcept.collection.sorting;

// Natural sorting by id
class Employee implements Comparable<Employee> {

    int id;
    String name;

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}
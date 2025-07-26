package com.firealgo.dsandalgo.practise.ds;

public class DemoDS {
    public static void main(String[] args) {
       LinkedListDemo();
    }

    private static void LinkedListDemo() {
        MyLinkedList ll = new MyLinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(19);
        ll.printNodes();
    }

    private static void stackDemo() {
        MyStack stack = new MyStack();
        System.out.println(stack.isEmpty()); // true
        stack.push(4);
        stack.push(2);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.peek()); // 6
        System.out.println(stack.pop()); // 6
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 2
        System.out.println(stack.size()); // 1
    }
}

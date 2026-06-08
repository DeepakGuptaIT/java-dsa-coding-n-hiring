package com.firealgo.problemsolving.leetcode.leetcode75.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NumberOfRecentCall933 {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        List<Integer> res = List.of(
                obj.ping(1),
                obj.ping(100),
                obj.ping(3000),
                obj.ping(4000),
                obj.ping(9000)
        );
        System.out.println("Res = "+ res);

    }
}

class RecentCounter {
    Deque<Integer> deque = new LinkedList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        while (!deque.isEmpty() && (t - deque.peekFirst()) > 3000) {
            deque.pollFirst();
        }
        deque.addLast(t);
        return deque.size();
    }

}

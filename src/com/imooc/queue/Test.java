package com.imooc.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offerFirst(1);
        q1.offerFirst(2);
        q1.offerFirst(3);

        System.out.println(q1.pollLast());
    }

}

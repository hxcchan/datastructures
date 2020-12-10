package com.imooc.array;
/**
 * test first
 * add one more test
 *
 * we need to add more
 *
 * Guys, this is the last need to comit, if you see this after
 * rebase, it is ok.
 * */
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i ++) {
            arr.addLast(i);
        }

        arr.add(1, 100);

        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
    }
}

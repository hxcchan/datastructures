package com.imooc.linkedlist;

public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this.e = e;
            next = null;
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;


    public LinkedList(){
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index is not correct");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            prev.next = new Node(e, prev.next);
            size++;
        }

    }
    public void addFirst(E e){
        head = new Node(e, head);
        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }
}

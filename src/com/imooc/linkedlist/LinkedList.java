package com.imooc.linkedlist;

public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
            next = null;
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node dummyHead;
    private int size;
    public LinkedList(){
        dummyHead = new Node(null, null);
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

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = new Node(e, prev.next);
        size++;

    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }

        cur.e = e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }

        res.append("NULL");
        return res.toString();
    }

    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed");
        }
        Node prev = dummyHead;
        Node cur = dummyHead.next;

        for (int i = 0; i < index; i++){
            prev = prev.next;
            cur = cur.next;
        }
        E result = cur.e;
        prev.next = cur.next;
        cur.next = null;
        return result;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);

    }}

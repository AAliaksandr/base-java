package com.basjava.lesson7.task5;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(E element) {
            this.item = element;
        }
    }

    public void add(E element) {
        Node<E> newNode = new Node<E>(element);
        if (first == null) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);

        Node<E> newNode = new Node<E>(element);
        if (index == 0) {
            add(element);
        }
        if (index == size) {
            last.next = newNode;
            last = newNode;
        }
        Node<E> oldNode = first;
        for (int i = 0; i < index; i++) {
            oldNode = oldNode.next;
        }
        Node<E> oldPrevious = oldNode.prev;
        oldPrevious.next = newNode;
        oldNode.prev = newNode;

        newNode.prev = oldPrevious;
        newNode.next = oldNode;
        size++;
    }

    public int size(){
        return size;
    }

    public E get(int index) {
       checkPositionIndex(index);

        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.item;
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}


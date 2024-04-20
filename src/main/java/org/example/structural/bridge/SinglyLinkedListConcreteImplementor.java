package org.example.structural.bridge;

public class SinglyLinkedListConcreteImplementor<T> implements LinkedListImplementor<T>{
    @Override
    public void addFirst(T element) {

    }

    @Override
    public void addLast(T element) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}

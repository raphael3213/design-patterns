package org.example.structural.bridge;

public interface LinkedListImplementor<T> {

    void addFirst(T element);

    void addLast(T element);

    T removeFirst();

    T removeLast();

    int getSize();
}

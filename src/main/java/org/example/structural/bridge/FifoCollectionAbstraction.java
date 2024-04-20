package org.example.structural.bridge;

public interface FifoCollectionAbstraction<T> {
    void offer(T value);

    T poll();


}

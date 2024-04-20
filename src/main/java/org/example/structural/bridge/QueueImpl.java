package org.example.structural.bridge;

public class QueueImpl<T> implements FifoCollectionAbstraction<T>{

    private final LinkedListImplementor<T> list;

    public QueueImpl(LinkedListImplementor<T> linkedListImplementor){
        this.list = linkedListImplementor;
    }

    @Override
    public void offer(T value) {
        list.addLast(value);

    }

    @Override
    public T poll() {
        if(list.getSize() == 0) throw new ArrayIndexOutOfBoundsException();
        return list.removeFirst();
    }
}

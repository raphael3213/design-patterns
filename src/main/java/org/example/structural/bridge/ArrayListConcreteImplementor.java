package org.example.structural.bridge;

import java.util.ArrayList;

public class ArrayListConcreteImplementor<T> implements LinkedListImplementor<T>{

    private final ArrayList<T> arrayList = new ArrayList<T>();


    @Override
    public void addFirst(T element) {

        arrayList.add(0 , element);

    }

    @Override
    public void addLast(T element) {
        arrayList.add(getSize(),  element );
    }

    @Override
    public T removeFirst() {
        return arrayList.remove(0);
    }

    @Override
    public T removeLast() {
        return arrayList.remove(getSize() - 1);
    }

    @Override
    public int getSize() {
        return arrayList.size();
    }
}

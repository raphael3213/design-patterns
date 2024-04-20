package org.example.structural.bridge;

public class Main {
    public static void main(String[] args) {

        FifoCollectionAbstraction<Integer> queue = new QueueImpl<>(new ArrayListConcreteImplementor<>());

        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(20);



        while (true) {
            try {
                Integer item = queue.poll();
                System.out.println("Polled item: " + item);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Queue is empty, cannot poll further.");
                break; // Exit the loop when ArrayIndexOutOfBoundsException is caught
            }
        }
    }
}

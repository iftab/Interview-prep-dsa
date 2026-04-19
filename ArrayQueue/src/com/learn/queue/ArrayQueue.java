package com.learn.queue;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;
    private int size;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    public void enqueue(Employee employee) {
        if(size() == queue.length - 1){
            int numItems = size();
            System.out.println("Re-sizing the queue");
            Employee[] newQueue = new Employee[queue.length * 2];
            System.arraycopy(queue, front,newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, back);

            queue = newQueue;
            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if(back < queue.length){
            back++;
        }else{
            back = 0;
        }
        size++;
    }

    public Employee dequeue() {
       if(size == 0){
           throw new RuntimeException("Queue is empty");
       }
       Employee employee = queue[front];
       queue[front] = null;
       front++;
       if(back - front == 0){
           front = 0;
           back = 0;
       }else if(front == queue.length){
           front = 0;
       }
       size--;

       return employee;
    }

    public Employee peek() {
        if(size == 0){
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    public void printQueue(){
        if(front <=back){
            for(int i = front; i < back; i++){
                System.out.println(queue[i]);
            }
        }else {
            for(int i = front; i < queue.length; i++){
                System.out.println(queue[i]);
            }
            for(int i = 0; i < back; i++){
                System.out.println(queue[i]);
            }
        }
        }


    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return queue.length - front + back;
        }
    }

}

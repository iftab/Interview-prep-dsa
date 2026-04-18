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
        if(back == queue.length){
            System.out.println("Re-sizing the queue");
            Employee[] newQueue = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0,queue.length);
            this.queue = newQueue;
        }
        queue[back++] = employee;
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
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }

    public int size(){
        return back - front;
    }

}

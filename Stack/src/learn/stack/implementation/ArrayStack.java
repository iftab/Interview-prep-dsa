package learn.stack.implementation;

import java.util.EmptyStackException;


/* Stack
 1) LIFO - Last In First Out.
 2) Insertion is O(1).
 3) Remove operation takes O(1)
 4) Re-Size array takes O(n) shift to new Array.
 */
public class ArrayStack {
    private Employee[] stack;
    private int top;

    public  ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    // Adding items to Array.
    public void push(Employee employee){
        if(top == stack.length){
            // Resize Array
            Employee[] temp = new Employee[2*stack.length];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }
        stack[top++] = employee;
    }

    // Peeking into Stack.
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    // Stack Empty Validation.
    public boolean isEmpty(){
        return top == 0;
    }
    // Removing items from Stack and shifting top previous
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null; // Setting top to NULL
        return employee;
    }

   // Size of Stack.
    public int size(){
        return top;
    }

   // Print Stack items.
    public void printStack(){
        for(int i = top-1; i >= 0; i--){
            System.out.print("\t"+stack[i]);
        }
    }
}

import learn.stack.implementation.ArrayStack;
import learn.stack.implementation.Employee;


public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Munsi", "Iftabuddin", 1));
        stack.push(new Employee("Munsi", "Alauddin", 2));
        stack.push(new Employee("Munsi", "Aftabuddin", 3));
        stack.printStack();
    }
}



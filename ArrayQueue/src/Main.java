import com.learn.queue.ArrayQueue;
import com.learn.queue.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 30, "Male");
        Employee employee2 = new Employee("Jane", 25, "Female");
        Employee employee3 = new Employee("Bob", 40, "Male");
        Employee employee4 = new Employee("Alice", 28, "Female");


        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(employee1);
        queue.enqueue(employee2);
        queue.enqueue(employee3);
        queue.enqueue(employee4);
        queue.printQueue();
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.dequeue();
        System.out.println("After Dequeue:");
        queue.printQueue();
        System.out.println(queue.size());

    }
}
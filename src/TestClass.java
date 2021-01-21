/**
 * This is the main class, which is used to test if model classes can work together to
 * achieve the purpose of the program.
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class TestClass {
    public static void main(String[] args) {
        // create an object of TimsOrder by using class name to call static method of it
        TimsOrder order = TimsOrder.create();
        // execute toString() method of instance order
        System.out.println(order);
        // execute getAmountDur() method
        System.out.printf("Total Price: $%.2f\n",order.getAmountDue());

    }
}

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is a model class, which is used to create objects in static method and calculate
 * how much customer has to pay. Plus, it overrides the toString() method.
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class TimsOrder {
    /* the number of products the customer needs */
    private int size;
    /* the customer's name */
    private String cstName;
    /* array used to store TimsProduct */
    private TimsProduct[] tp;

    /**
     * Private constructor in order to avoid other users to create instances of this class
     * @param customerName // customer name who place orders
     * @param size // how many products customer wants
     */
    private TimsOrder(String customerName, int size) {
        this.cstName = customerName;
        this.size = size;
    }

    /**
     * Calculate how much customer has to pay based on the products they are purchasing
     * @return the amount which customer has to pay
     */
    public double getAmountDue() {
        double sum = 0;
        for (TimsProduct t : tp
        ) { // check the type of the element in the array to avoid throwing exception
            if (t instanceof BoxOfNails) {
                sum += t.getRetailPrice();
            } else if (t instanceof NailGun) {
                if (((NailGun) t).isRented()) {
                    sum += ((NailGun) t).getRentalCost();
                } else {
                    sum += t.getRetailPrice();
                }
            } else if (t instanceof Knob) {
                sum += t.getRetailPrice();
            } else if (t instanceof Dolly) {
                if (((Dolly) t).isRented()) {
                    sum += ((Dolly) t).getRentalCost();
                } else {
                    sum += t.getRetailPrice();
                }

            }
        }
        return sum;
    }

    /**
     * This is a static method used to ask information about the orders customer want and
     * create an instance of TimsOrder by calling its private constructor
     * @return an object of TimsOrder
     */
    public static TimsOrder create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("How many products do you want?");
        int number = sc.nextInt();
        sc.nextLine();
        TimsOrder orders = new TimsOrder(name, number);
        orders.tp = new TimsProduct[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Do you want BoxOfNails, NailGun, Knob or Dolly? b/n/k/d");
            String answer = sc.nextLine();
            if (answer.toLowerCase().charAt(0) == 'b') {
                orders.tp[i] = BoxOfNails.create();
            } else if (answer.toLowerCase().charAt(0) == 'n') {
                orders.tp[i] = NailGun.create();
            } else if (answer.toLowerCase().charAt(0) == 'k') {
                orders.tp[i] = Knob.create();
            } else if (answer.toLowerCase().charAt(0) == 'd') {
                orders.tp[i] = Dolly.create();
            }
        }
        return orders;
    }
    /**
     * Override the toString() method to present TimsOrder
     *
     * @return the representation of TimsOrder
     */
    @Override
    public String toString() {
        String message = "\n" + size + " orders for: " + cstName + "\n";
        String info = "";
        for (TimsProduct t : tp
        ) {
            info += t.toString() + "\n";
        }
        return message + info;

    }
}

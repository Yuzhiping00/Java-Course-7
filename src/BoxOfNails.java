import java.util.Scanner;

/**
 * This class is a subclass of TimsProduct, which inherits some instance variables and methods
 * from base class. However, it has its own fields, such as size and quantity. It overrides
 * toString() method
 *
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class BoxOfNails extends TimsProduct {
    /* size of nails */
    private double size;
    /* the number of nails in a box of nails */
    private int quantity;

    /**
     * Constructor which calls super class constructor to initialize some instance variables
     * and assign other instance variables from parameters
     *
     * @param name     the name of the BoxOfNails
     * @param size     the size of the nails
     * @param quantity the number of nails in a box
     * @param cost     the cost of a box of nails
     * @param price    the price of a box of nails
     */
    private BoxOfNails(String name, double size, int quantity, double cost, double price) {
        super(name, cost, price); // call constructor of super class
        this.size = size;
        this.quantity = quantity;
    }

    /**
     * This is a static method, which asks user for information about the instance of BoxOfNails and create an instance of
     * BoxOfNails by calling private constructor
     *
     * @return an instance of BoxOfNails
     */
    public static BoxOfNails create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of box of nails?");
        String name = sc.nextLine();
        System.out.println("What is the size of the nails?");
        double size = sc.nextDouble();
        System.out.println("How many nails in the box?");
        int quantity = sc.nextInt();
        System.out.println("How much does it cost?");
        double cost = sc.nextDouble();
        System.out.println("What is the selling price?");
        double price = sc.nextDouble();
        BoxOfNails nails = new BoxOfNails(name, size, quantity, cost, price); // create an object
        return nails;
    }

    /**
     * Get the size of the nails in a box of nails
     *
     * @return the size of the nails
     */
    public double getSize() {
        return size;
    }

    /**
     * Get the number of nails in one box of nails
     *
     * @return the quantity of nails in a box
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Override the toString() method to present BoxOfNails
     *
     * @return the representation of the BoxOfNails
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "    Type... BoxOfNails{" + "size=" + size + ", quantity=" + quantity + '}';
    }
}

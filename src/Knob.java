import java.util.Scanner;
/**
 * This class is a subclass of TimsProduct, which inherits some instance variables and methods
 * from base class. However, it has its own fields, such as size. It overrides
 * toString() method
 *
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class Knob extends TimsProduct{
    /* the size of the knob */
    private double size;
    /**
     * Constructor which calls super class constructor to initialize some instance variables
     * and assign other instance variables from parameters
     *
     * @param name     the name of the knob
     * @param size     the size of the knob
     * @param cost     the cost of the knob
     * @param price    the price of the knob
     */
    private Knob(String name, double size, double cost, double price){
        super(name,cost, price); // call super class constructor
        this.size = size;
    }
    /**
     * This is a static method, which asks user for information about the instance of Knob and create an instance of
     * Knob by calling private constructor
     *
     * @return an instance of Knob
     */
    public static Knob create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of knob?");
        String name = sc.nextLine();
        System.out.println("What is the size of the knob?");
        double size = sc.nextDouble();
        System.out.println("How much does it cost?");
        double cost = sc.nextDouble();
        System.out.println("What is the selling price?");
        double price = sc.nextDouble();
        Knob k = new Knob(name,size,cost,price);
        return k;
    }
    /**
     * Get the size of the knob
     *
     * @return the size of the knob
     */
    public double getSize(){
        return size;
    }
    /**
     * Override the toString() method to present Knob
     *
     * @return the representation of the Knob
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+"    Type... Knob{" + "size= " + size + "}";
    }
}


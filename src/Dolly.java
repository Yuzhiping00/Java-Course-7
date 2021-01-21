import java.util.Scanner;
/**
 * This class is a subclass of TimsProduct, which inherits some instance variables and methods
 * from base class. However, it has its own fields, such as weight. It overrides
 * toString() method
 *
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class Dolly extends RentableHardware {
    /* the weight of the Dolly instance */
    private double weight;

    /**
     * Constructor which calls super class constructor to initialize some instance variables
     * and assign other instance variables from parameters
     * @param name the name of the dolly
     * @param weight the weight of the dolly
     * @param rentalCost the rental cost of the dolly
     * @param cost the cost of the dolly
     * @param price the retaul price of the dolly
     */
    private Dolly(String name, double weight, double rentalCost, double cost, double price){
        super(name,rentalCost,cost,price);
        this.weight = weight;
    }
    /**
     * This is a static method, which asks user for information about the instance of Dolly
     * and create an instance of Dolly by calling private constructor
     *
     * @return an instance of Dolly
     */
    public static Dolly create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the Dolly? ");
        String name = sc.nextLine();
        System.out.println("What is the weight of it?");
        double weight = sc.nextDouble();
        System.out.println("How much is the rental cost?");
        double rentalCost = sc.nextDouble();
        System.out.println("What is the cost of it?");
        double cost = sc.nextDouble();
        System.out.println("What is the selling price?");
        double price  = sc.nextDouble();
        Dolly d = new Dolly(name,weight,rentalCost,cost,price); // create an object
        sc.nextLine(); // clear buffer
        System.out.println("Would you like to rent or buy?  r/b");
        String choice = sc.nextLine();
        if(choice.toLowerCase().charAt(0)=='r'){
            d.rented();
        }else if(choice.toLowerCase().charAt(0)=='b'){
            d.returned();
        }
        return d;
    }

    /**
     * Get the weight of the dolly
     * @return the weight of the dolly
     */
    public double getWeight(){
        return weight;
    }
    /**
     * Override the toString() method to present Dolly
     *
     * @return the representation of the Dolly
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+"    Type...  Dolly{" + "weight=" + weight + " }";
    }
}


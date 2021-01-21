import java.util.Scanner;
/**
 * This class is a subclass of RentableHardware, which inherits some instance variables and methods
 * from base class. However, it has its own fields, features. It overrides
 * toString() method
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public class NailGun extends RentableHardware {
    /* the features of the nailgun */
    private String features;

    /**
     * Constructor which calls super class constructor to initialize some instance variables
     * and assign other instance variables from parameters
     * @param name the name of the nailgun
     * @param features the features of the nailgun
     * @param rentalCost the rental cost of the nailgun
     * @param cost the production cost of the nailgun
     * @param price the retail price of the nailgun
     */
    private NailGun(String name, String features, double rentalCost, double cost, double price){
        super(name,rentalCost,cost,price); // call super class constructor
        this.features = features;
    }
    /**
     * This is a static method, which asks user for information about the instance of NailGun
     * and create an instance of NailGun by calling private constructor
     * @return an instance of NailGun
     */
    public static NailGun create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the NailGun? ");
        String name = sc.nextLine();
        System.out.println("What is the feature of it?");
        String features = sc.nextLine();
        System.out.println("How much is the rental cost?");
        double rentalCost = sc.nextDouble();
        System.out.println("What is the cost of it?");
        double cost = sc.nextDouble();
        System.out.println("What is the selling price?");
        double price  = sc.nextDouble();
        NailGun ng = new NailGun(name,features,rentalCost,cost,price); // create an object
        sc.nextLine(); // clear buffer
        System.out.println("Would you like to rent or buy?  r/b");
        String choice = sc.nextLine();
        if(choice.toLowerCase().charAt(0)=='r'){
            ng.rented();
        }else if(choice.toLowerCase().charAt(0)=='b'){
            ng.returned();
        }
        return ng;
    }

    /**
     * Get the features of the nailgun
     * @return the feature of the nailgun
     */
    public String getFeatures(){
        return features;
    }

    /**
     * Override the toString() method to present NailGun
     *
     * @return the representation of the NailGun
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+"    Type...  NailGun{" + "features= " + "\""+features+"\"}" ;
    }
}

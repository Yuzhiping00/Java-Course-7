import java.util.Scanner;
/**
 * This class is an abstract class, which inherits some instance variables and methods
 * from TimsProduct class and it also implements interface Rentable. However, it has its own fields,
 * such as rentalCost and rented. It overrides
 * toString() method
 *
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public abstract class RentableHardware extends TimsProduct implements Rentable {
    /* the rentable of rentable hardware */
    private double rentalCost;
    /* check if rentable hardware is rented or not */
    private boolean rented;

    /**
     * Constructor which calls super class constructor to initialize some instance variables
     * and assign other instance variables from parameters
     * @param name the name of rentable hardware
     * @param rentalCost  the rental cost of the rentable hardware
     * @param cost the production cost of the rentable hardware
     * @param price the retail price of the rentable hardware
     */
    public RentableHardware(String name, double rentalCost, double cost, double price ){
        super(name, cost, price);
        this.rentalCost= rentalCost;
    }

    /**
     * Get the rental cost of the rentable hardware
     * @return the rental cost of the rentable hardware
     */
    public double getRentalCost() {
        return rentalCost;
    }

    /**
     * set the value of instance variable rented to true
     */
    public void rented(){
        this.rented = true;

    }
    /**
     * set the value of instance variable rented to false
     */
    public void returned(){
        this.rented = false;

    }

    /**
     * Get the value of instance variable rented
     * @return the value of instance variable rented
     */
    public boolean isRented(){
        return rented;

    }
    /**
     * Override the toString() method to present RentableHardware
     *
     * @return the representation of RentableHardware
     */
    @Override
    public String toString() {
        return super.toString()+"\n"+"    Type...  RentableHardware{" + "rentalCost="
                + rentalCost + ", rented=" + rented + '}';
    }
}

/**
 * This class is an abstract class, which implements interface Commodity. It has its own fields,
 * such as name,cost,price. It overrides toString() method
 *
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public abstract class TimsProduct implements Commodity {
    /* the name of the TimsProduct */
    private String name;
    /* the cost of the TimsProduct */
    private double cost;
    /* the price of the TimsProduct */
    private double price;

    /**
     * Constructor
     * @param name initialize the name of TimsProduct
     * @param cost initialize the cost of TimsProduct
     * @param price initialize the price of TimsProduct
     */
    public TimsProduct(String name, double cost, double price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Get the name of the TimsProduct
     * @return the name of the TimsProduct
     */
    public String getName() {
        return name;
    }

    /**
     * Get the cost of the TimsProduct
     * @return the cost of TimsProduct
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * Get the retail price of the TimsProduct
     * @return the retail price of the TimsProduct
     */
    public double getRetailPrice() {
        return price;
    }
    /**
     * Override the toString() method to present TimsProduct
     *
     * @return the representation of TimsProduct
     */
    @Override
    public String toString() {
       return  "TimsProduct{name= " + "\"" + name + "\"" +", cost=" + cost + ", price=" + price + " }";

    }
}

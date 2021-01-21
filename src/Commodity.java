/**
 * This is an interface, which provides abstract methods for concrete classes to implements.
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public interface Commodity {
    /**
     * This is an abstract method with only method declaration
     * @return the production cost of the product
     */
    public abstract double getProductionCost();

    /**
     * This is an abstract method without body
     * @return the retailPrice of the product
     */
    public  abstract double getRetailPrice();

}

/**
 * This is an interface, which provides abstract methods for concrete classes to implements.
 * @author Zhiping Yu    Student number: 000822513   Date: 2020,07
 */
public interface Rentable {
     /**
      * This is an abstract class without method body
      */
     public abstract void  rented();

     /**
      * This is an abstract class without method body
      */
     public abstract void returned();

     /**
      * This is an abstract class without method body and force implementing classes to override
      * the method
      * @return boolean check if product is rented or not
      */
     public abstract boolean isRented();
}

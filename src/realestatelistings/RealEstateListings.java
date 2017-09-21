
package realestatelistings;

/**
 *
 * @author Christopher
 */
public class RealEstateListings {

    public static void main(String[] args) {

        //This program's focus is on creating a class that is not the main class
        //and instantiating new objects from the class "Property" class

        //This program will invoke the Property class to instantiate objects
        //within the main RealEstateListing class and assign values to the
        //instance variables within the Property class. The constructors
        //in the Property class with recieve the arguments passed via 
        //parameters of the two different non return type constructors
        //and use the this keyword to assign the values.


        
        //creating/instantiating Property objects
        Property land = new Property(10000,"Land",2.1);
        Property estate = new Property(250000,"Estate", 1.5, 3, 4);
        
        //print out the objects string values using the method toString in 
        //Property class
        System.out.println(land.toString());
        System.out.println(estate.toString());
        
        //invoke the mutator method setAskingPrice in the Property class
        estate.setAskingPrice(230000);
        
        System.out.println(estate.toString());
        
        
    }
    
}

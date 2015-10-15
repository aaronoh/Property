/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.util.Scanner;

/**
 *
 * @author ultrarpbworld
 */
public class RealEstateListings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        Scanner in = new Scanner(System.in);
        boolean newProperty = true;
        String aProperty = null;
        
        double propertyPrice;
        String propertyType;
        double propertySize;
        int propertyBaths;
        int propertyBeds;
        
        while (newProperty){
        System.out.println("Enter Property Price: ");
        propertyPrice = in.nextDouble();
        
        System.out.println("Enter property Type: ");
        propertyType = in.next();
        
        System.out.println("Enter property Size: ");
        propertySize = in.nextDouble();
        
        System.out.println("Enter Number of Bathrooms: ");
        propertyBaths = in.nextInt();
        
        System.out.println("Enter Number of Bedrooms: ");
        propertyBeds = in.nextInt();
        
        
      //System.out.println("Enter a Property");
      Property prop = new Property(propertyPrice, propertyType, propertySize,propertyBaths, propertyBeds );//Enter your 4 variables.
      System.out.println(prop.toString());//Print all information to a string.
      
      
      System.out.println(prop.getNumBaths());
      System.out.println("Enter new number of bathrooms: ");
      prop.setNumBaths(in.nextInt());
      System.out.println ("New Baths No. " + prop.getNumBaths()); 
      
      
      
      
      System.out.println("Would you like to enter another Property?");
        //in.nextLine();
        aProperty = in.next();
                if (aProperty.contains("y")) {
                newProperty = true;
                }
                if (aProperty.contains("n")){
                newProperty = false;
                }
                
         
      }
    
        }
    }
}
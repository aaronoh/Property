/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

/**
 *
 * @author Peggy Fisher
 */
public class Property {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    public Property(double askingPrice, String propertyType, double lotSize)
    {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        numBaths = 0;
        numBeds = 0;
    }
    public Property(double askingPrice, String propertyType, double lotSize, 
            int numBaths, int numBeds)
    {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }
    public String toString()
    {
        return "Asking price: $" + askingPrice + 
                "\nProperty Type: " + propertyType + 
                "\nLot Size: " + getLotSize() + 
                "\nNumber of baths: " + getNumBaths() + 
                "\nNumber of bedrooms: "+getNumBeds();
    }
	
	public double getAskingPrice()
	{
		return askingPrice;
	}
	
	public String getPropertyType()
	{
		return propertyType;
	}
	
    public void setAskingPrice(double newValue)
    {
        askingPrice = newValue;
    }
    
	public void setPropertyType(String newType)
	{
		propertyType = newType;
	}

    /**
     * @return the lotSize
     */
    public double getLotSize() {
        return lotSize;
    }

    /**
     * @param lotSize the lotSize to set
     */
    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * @return the numBaths
     */
    public int getNumBaths() {
        return numBaths;
    }

    /**
     * @param numBaths the numBaths to set
     */
    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    /**
     * @return the numBeds
     */
    public int getNumBeds() {
        return numBeds;
    }

    /**
     * @param numBeds the numBeds to set
     */
    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }
	
      


}
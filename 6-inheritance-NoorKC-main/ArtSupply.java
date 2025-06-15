/**
 * generic Art Supply class
 */
public class ArtSupply {
    
    private String brand;
    private Double cost;
    private String drawType;

    /**
     * constructor for art supply
     * @param brand the brand name of the object
     * @param cost how much the item costs
     * @param drawType is it used for traditional or digital art
     */
    public ArtSupply(String brand, Double cost, String drawType){
        this.brand = brand;
        this.cost = cost;
        this.drawType = drawType;
    }

    /**
     * get the brand name of the item
     * @return the brand as a String
     */
    public String getBrand(){
        return this.brand;
    }

    /**
     * get the cost of the item
     * @return the cost as a double
     */
    public Double getCost(){
        return this.cost;
    }

    /**
     * get the type of art it is used for
     * @return the type as a String
     */
    public String getDrawType(){
        return this.drawType;
    }

    /**
     * A string that displays all the information in a organized manner for a human to read
     */
    public String toString(){
        String output = "";
        output += "Brand: " + this.brand + "\n";
        output += "Cost: " + this.cost + "\n";
        output += "Draw Type: " + this.drawType + "\n";

        return output;
    }
}

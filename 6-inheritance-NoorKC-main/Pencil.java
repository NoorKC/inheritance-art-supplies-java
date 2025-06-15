/**
 * represents a type of of art supply, a pencil
 */
public class Pencil extends ArtSupply{
    
    private String pigment;
    private String ledColor;
    private Float ledSize;

    /**
     * constructor for pencil storing all parameters including the ones from the superclass
     * @param brand the brand name of the pencil
     * @param cost the cost of the pencil
     * @param drawType what type of art it is used for
     * @param pigment the type of led of the pencil
     * @param ledColor the color of led of the pencil
     * @param ledSize the size of led of the pencil
     */
    public Pencil (String brand, Double cost, String drawType, String pigment, String ledColor, Float ledSize){
        // call to the super class contructor (ArtSupply)
        super(brand, cost, drawType);
        this.pigment = pigment;
        this.ledColor = ledColor;
        this.ledSize = ledSize;
    }
    
    /**
     * the type of led of the pencil (HB, B1, B2...)
     * @return the led type as a String
     */
    public String getPigment(){
        return this.pigment;
    }

    /**
     * the color of led in the pencil
     * @return the led color as a String
     */
    public String ledColor(){
        return this.ledColor;
    }

    /**
     * the thickness of the led (0.3,0.5,0.7...)
     * @return the size of the led as a float
     */
    public Float ledSize(){
        return this.ledSize;
    }

    /**
     * display all the information about a pencil to make it easy for people to read
     */
    public String toString(){
        // use the toString from the super class to obtain ALL informatin of the pencil
        String output = super.toString();
        output += "Pigment: " + this.pigment + "\n";
        output += "Led Color: " + this.ledColor + "\n";
        output += "Led thickness: " + this.ledSize + "\n";

        return output;
    }

}



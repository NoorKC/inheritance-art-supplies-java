/**
 * represents a type of art supply, a paint brush
 */
public class Paintbrush extends ArtSupply{
    
    private Float thickness;
    private String shape;

    /**
     * constructor for paint brush with all its information and information from the super class
     * @param brand the brand name of the paint brush
     * @param cost the cost of the paint brush
     * @param drawType the type of art it is used for
     * @param thickness the brush size or thickness
     * @param shape the shape of the paint brush (round, flat, angled...)
     */
    public Paintbrush(String brand, Double cost, String drawType, Float thickness, String shape){
        // call to the super class contructor
        super(brand, cost, drawType);
        this.thickness = thickness;
        this.shape = shape;
    }

    /**
     * the size of the paintbrush
     * @return the thickness as a float
     */
    public Float getThickness(){
        return this.thickness;
    }

    /**
     * the shape of the paint brush tip
     * @return the shape as a string
     */
    public String getShape(){
        return this.shape;
    }

    /**
     * create a toString that displays all the information in a way people can read it easily
     */
    public String toString(){
        // call the super class toString to find additional information on the paint brush
        String output = super.toString();
        output += "Thickness of brush: " + this.thickness + "\n";
        output += "Shape of brush: " + this.shape + "\n";

        return output;
    }
}

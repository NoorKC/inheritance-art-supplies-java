/**
 *
 * @author Eknoor Kaur
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArtSupply a1 = new ArtSupply("Pentel", 14.99, "Traditional");
        ArtSupply a2 = new ArtSupply("Faber-Castell", 20.19, "Traditional");
        Pencil p1 = new Pencil("Pentel",5.25,"Traditional","HB","Black",0.3f);
        Paintbrush b1 = new Paintbrush("Golden Taklon",7.99,"Traditional",1/8f,"Angle Shader");
        ArtSupply a3 = new ArtSupply("Apple", 129.00, "Digital");

        // create an array of type ArtSupply to store all the objects
        ArtSupply[] supplies = new ArtSupply[5];
        // set all the items as a Art Supply because they all qualify since it is the super class
        supplies[0] = a1;
        supplies[1] = a2;
        supplies[2] = p1;
        supplies[3] = b1;
        supplies[4] = a3;

        //create a space to make it look neat
        System.out.println();

        //go through all items to find a Pencil
        for(int i = 0; i < 5; i++){
            if(supplies[i] instanceof Pencil){
                // cast an object - convert it to a different version
                Pencil p2 = (Pencil)supplies[i];
                // you can print commands like the one below to find certain information about certain objects
                //System.out.println(p2.getPigment());
            }
            // print all the objects out
            System.out.println(supplies[i]);
        }

    }
    
}

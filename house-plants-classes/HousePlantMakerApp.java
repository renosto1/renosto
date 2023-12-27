/* This is an open task, exact design and completion is up to you.
Create an application that uses Inheritance. Your application 
should have 3 classes, a superclass, a subclass and an app class
that implements an object of the subclass.
 */


 //House Plant > Orchid > specific plant objetct
 //classthat implements an object
public class HousePlantMakerApp {
    public static void main(String[] args) {
        Orchid orchid1 = new Orchid();
        System.out.println(orchid1.getSize() + " with " + orchid1.getPerfume() );
        orchid1.specifications("pink", "green");
        orchid1.waterCheck();
        orchid1.water();
        orchid1.waterCheck();

        System.out.println(" ");

        System.out.println("New Orchid: ");
        Orchid orchid2 = new Orchid();
        orchid2.specifications("medium", "strong");
        System.out.println(orchid1.getSize() + " with " + orchid1.getPerfume() );
        orchid2.specifications("yellow", "white");
        orchid2.waterCheck();
        orchid2.water();
        orchid2.waterCheck();

        System.out.println(" ");
        System.out.println("Generic Plant");
        HousePlants genericPlant = new HousePlants();
        System.out.println("Leaves colour: " + genericPlant.getLeavesColour() + ". Vase clorous: " + genericPlant.getVase());









    }

}


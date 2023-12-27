//superclass
public class HousePlants {
    private boolean needsWater;
    private String leavesColour;
    private String vaseColour;


    //constructor
    public HousePlants(){
        needsWater = true;
        leavesColour = "green";
        vaseColour = "black";
    }

    public void specifications(String leavesColour, String vaseColour){
        this.leavesColour = leavesColour;
        this.vaseColour = vaseColour;
        System.out.println("Leaves colour is "+ leavesColour + " and the vase is " + vaseColour);
    }

    public String getLeavesColour(){
        return leavesColour;
    }

    public String getVase(){
        return vaseColour;
    }

    public void water(){
        System.out.println("You gave water to the plant");
        needsWater = false;
    }

    public void waterCheck(){
        if(needsWater){
            System.out.println("This plant needs water");
        }
        else{
            System.out.println("This plant doesn't need water");
        }
    }

    
}

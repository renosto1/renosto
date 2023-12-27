//subclass
public class Orchid extends HousePlants{
    private String size;
    private String perfume;

    //constroctor
    public Orchid(){
        this.size = size;
        this.perfume = perfume;
        size = "Small";
        perfume = "Sweet";
        System.out.println("This plant is an Orchid");
    }

    public void setSizeAndPerfume(String size, String perfume){
        this.size = size;
        this.perfume = perfume;
    }

    public String getSize(){
        return "Size " + size; 
    }

    public String getPerfume(){
        return perfume + " perfume"; 
    }
    
}
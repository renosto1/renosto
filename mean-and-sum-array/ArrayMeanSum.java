public class ArrayMeanSum{
    //vars
    private int[] arrayOfNum;
    private double sum;
    private double mean;


    //set
    public void setVars(int[] arrayOfNum, double sum, double average){
        this.arrayOfNum = arrayOfNum;
        this.sum = sum;
        this.mean = average;
    }

    //process
    public void processArray(){
        for(int i = 0; i < arrayOfNum.length; i++){
            sum += arrayOfNum[i];
        }
        mean = sum / arrayOfNum.length;
    }

    //get
    public double getSum(){
        return sum ;
    }
    public double getMean(){
        return mean;
    }

    }



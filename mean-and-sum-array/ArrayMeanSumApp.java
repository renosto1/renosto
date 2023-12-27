//Return the mean and sum of an array of numbers
public class ArrayMeanSumApp {
    public static void main(String[] args) {
        //vars
        int[] arrayOfNum = {45, 98, 99, 15, 46};
        double sum = 0.0;
        double mean = 0.0;

        //obj
        ArrayMeanSum ams = new ArrayMeanSum();

        //set
        ams.setVars(arrayOfNum, sum, mean);
        //process
        ams.processArray();
        //get
        sum = ams.getSum();
        mean = ams.getMean();
        
        //output
        System.out.println("The mean of the array is "+ sum +" and the sum of the array is " + mean + ".");        
    }
    
}

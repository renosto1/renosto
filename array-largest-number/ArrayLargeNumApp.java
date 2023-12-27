//Create a preset array of numbers. Create a piece of code that chooses 
//the largest number from that array
import java.util.Arrays;
public class ArrayLargeNumApp {
    public static void main(String[] args) {
        //vars
        int min = 1;
        int max = (int)((Math.random() * 1000));
        int[] randomArray = new int[20];
        int maxNum = randomArray[0];
        int largeNum;
        

        //obj
        ArrayLargeNum an = new ArrayLargeNum();
        //set
        an.setVars(min, max, randomArray, maxNum);
        //process
        an.processMax();
        //get
        largeNum = an.getMaxNum();

        //output
        System.out.println(largeNum + " is the largest number of the following array " + Arrays.toString(randomArray) + "." );
    }
}

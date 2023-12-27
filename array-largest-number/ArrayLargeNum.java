public class ArrayLargeNum {
    //vars
    private int min;
    private int max;
    private int[] randomArray;
    private int maxNum;
    
    //set
    public void setVars(int min, int max, int[] randomArray, int maxNum){
        this.min = min;
        this.max = max;
        this.randomArray = randomArray;
        this.maxNum = maxNum;
    }
    //process
    public void processMax(){
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] += (int)((Math.random() * (max - min + 1) + min)); 
            }

        for(int i = 0; i < randomArray.length; i++){
            if(maxNum < randomArray[i]){
                maxNum = randomArray[i];
            }
        }

    }
    //get
    public int getMaxNum(){
        return maxNum;
    }
    
}
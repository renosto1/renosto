public class PositiveOrNegative {
    private int userNum;
    private String msg;

    //constroctor
    public PositiveOrNegative(){
        userNum = 0;
        msg = "";
    }

    //set method
    public void setUserNum(int userNum){
        this.userNum = userNum;
    }

    //compute
    public void checkNum(){
        if(userNum >= 0){
            msg = userNum + " is positive.";
        }
        else{
           msg = userNum + " is negative.";
        }
    }

      //get method
      public String getNum(){
        return msg;
    }
    
    
}

public class OddOrEven {
    //vars
    private int userNum;
    private String msg;
    //constroctor
    public OddOrEven(){
        userNum = 0;
        msg = "";
    }

    //set method
    public void setUserNum(int userNum){
        this.userNum = userNum;
    }

    //compute
    public void checkNum(){
        if(userNum % 2 == 1){
            msg = userNum + " is odd.";
        }
        else{
           msg = userNum + " is even.";
        }
    }

      //get method
      public String getNum(){
        return msg;
    }

}
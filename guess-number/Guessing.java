public class Guessing {
    //declare vars
    private int compNum;
    private int guessNum;
    private String msg;

    //constroctor
    public Guessing(){
        compNum = 0;
        guessNum = 0;
        msg = "";
    }

    //set method
    public void setNum(int compNum, int guessNum){
        this.compNum = compNum;
        this.guessNum = guessNum;
    }

    //compute

    public void checkNum(){
        for(int i = 0; i <= 3; i++){

            if(compNum == guessNum){
                msg = "Winner!";
                i = 3;
            }
            else if (guessNum > 5){
            msg = "Choose a number between 1 and 10.";
            }
            else{
                msg = "Loser! You guessed " + guessNum + " and the number was " + compNum + ".";
            }
    }
    }
    //get method
    public String getResult(){
        return msg;
    }

}

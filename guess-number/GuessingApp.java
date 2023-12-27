//Alter the guessing game application so that every time it plays the user 
//is asked do they want to play again. Depending on what the user enters 
//the application should keep going until they wish to stop.
//Bonus: store the user guesses and return them to the user when they finish or win.
//Note this may necessitate the creation of a large blank array
import javax.swing.JOptionPane;

public class GuessingApp {
    public static void main(String[] args){
    //vars
    int compNum = (int)((Math.random() * 10) +1); 
    int guessNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1 and 10"));
    String msg; 

     //declare and create objects
        Guessing guessGame;
        guessGame = new Guessing();

        //Set
        guessGame.setNum(compNum, guessNum);
        //compute
        guessGame.checkNum();
        //get
        msg = guessGame.getResult();
        //output
        System.out.println(compNum);
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

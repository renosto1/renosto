import javax.swing.JOptionPane;

public class PositiveOrNegativeApp {

     public static void main(String[] args){
        //declare vars
        int userNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number"));
        String msg;


        //declare and create objects
        PositiveOrNegative numApp;
        numApp = new PositiveOrNegative();

        //Set
        numApp.setUserNum(userNum);
        //compute
        numApp.checkNum();
        //get
        msg = numApp.getNum();
        //output
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

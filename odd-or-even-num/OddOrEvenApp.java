import javax.swing.JOptionPane;

public class OddOrEvenApp {
    public static void main(String[] args){
        //declare vars
        int userNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number"));
        String msg;


        //declare and create objects
        OddOrEven numApp;
        numApp = new OddOrEven();

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

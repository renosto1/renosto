import javax.swing.JOptionPane;
public class BloodApp{
public static void main(String[] args){
    //vars & input
    String bloodType =JOptionPane.showInputDialog(null, "Enter blod type");
    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
    String msg1;
    String msg2;

    //obj 
    Blood b = new Blood();

    //set
    b.setVars(age, bloodType);

    //process
    b.processBlood();

    //get
    msg1 = b.getBlood1();
    msg2 = b.getBlood2();



    //output
    JOptionPane.showMessageDialog(null, msg1);
    JOptionPane.showMessageDialog(null, msg2);


    }
}
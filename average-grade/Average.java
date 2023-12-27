//Create an application that asks a user how many subjects they take, 
//and will then ask what marks (0-100) they got in each subject. 
//The application should then output their average result
//Bonus: Tell the user their grade from A-F based on their results
import javax.swing.JOptionPane;

public class Average{
    public static void main(String[] args){
        int subjects = Integer.parseInt(JOptionPane.showInputDialog(null, "How many subjects you take? "));
        double mark = 0;
        double sum = 0;
        double average = 0;
        String grade;
        String name;

        for(int i = 0; i <= subjects -1; i++){
            name = JOptionPane.showInputDialog(null, "Enter subject number " + (i + 1) + " name");
            sum = sum + (mark = Double.parseDouble(JOptionPane.showInputDialog(null, "What marks (0-100) you got in this subject? ")));
            System.out.println("Subject: "+ name + ", mark: " + mark);
        }

         // A = 100 - 90, B = 89 - 80, C = 79 -70, D = 69 - 60, F = 59 - Below
        grade = String.valueOf((sum / subjects) / 100);

        if(Double.valueOf(grade) >= 0.9){
            grade = "A";
        }
        else if ((Double.valueOf(grade) >= 0.8) && (Double.valueOf(grade) <= 0.89)){
            grade = "B";
        }
         else if ((Double.valueOf(grade) >= 0.7) && (Double.valueOf(grade) <= 0.79)){
            grade = "C";
        }
         else if ((Double.valueOf(grade) >= 0.6) && (Double.valueOf(grade) <= 0.69)){
            grade = "D";
        }
        else{
            grade = "F";
        }

        average = sum / (subjects);
        JOptionPane.showMessageDialog(null, "Your average is: " + average + ". Your Grade is: " + grade + ".");    

    }
}
public class Blood {
//vars
private int age;
private String bloodType;
private String msg1, msg2;

//set
public void setVars(int age, String bloodType){
this.age = age;
this.bloodType = bloodType;
}

//process
public void processBlood(){
    if(age >= 18){
        
        if(bloodType.equalsIgnoreCase("AB")){
            msg1 = "You can give blood to AB";
            msg2 = "You can receive blood from AB, A, B, O";
        }
        else if(bloodType.equalsIgnoreCase("A")){
            msg1 = "You can give blood to A and AB";
            msg2 = "You can receive blood from A and O";
        }
        else if(bloodType.equalsIgnoreCase("B")){
            msg1 = "You can give blood to B and AB";
            msg2 = "You can receive blood from B and O";
        }
        else if(bloodType.equalsIgnoreCase("O")){
            msg1 = "You can give blood to AB, A, B, O";
            msg2 = "You can receive blood from O";
        }
        else{
            msg1 = "you entered " + bloodType + ". This is not a blood type.";
            msg2 = "Enter blood type: AB, A, B, O.";
        }

    }
    else if(age < 18){

         if(bloodType.equalsIgnoreCase("AB")){
            msg1 = "You cannot donate";
            msg2 = "You can receive blood from AB, A, B, O";
        }
        else if(bloodType.equalsIgnoreCase("A")){
            msg1 = "You cannot donate";
            msg2 = "You can receive blood from A and O";
        }
        else if(bloodType.equalsIgnoreCase("B")){
            msg1 = "You cannot donate";
            msg2 = "You can receive blood from B and O";
        }
        else if(bloodType.equalsIgnoreCase("O")){
            msg1 = "You cannot donate";
            msg2 = "You can receive blood from O";
        }
        else{
        msg1 = "you entered " + bloodType + ". This is not a blood type.";
        msg2 = "Enter blood type: AB, A, B, O.";
    }
    }

    else{
        msg1 = "you entered " + bloodType + ". This is not a blood type.";
        msg2 = "Enter blood type: AB, A, B, O.";
    }
}

//get
public String getBlood1(){
    return msg1;
}
public String getBlood2(){
    return msg2;
}
    
}

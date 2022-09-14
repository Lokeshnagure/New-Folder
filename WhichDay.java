import java.util.*;

public class WhichDay {
  public static void main(String[] arg){
  
  int number;
  Scanner sc = new Scanner (System.in);
  
  System.out.println("Enter the Number");
  
  number = sc.nextInt();
  String day="";
  
  if(number == 1) {
    day="Monday";
    }
else if(number == 2) {
  day = "Tuesday" ;
  if(number == 1) {
    day="Monday";
    }
 else  if(number == 3) {
    day="Wednesday";
    }
  else  if(number == 4) {
    day="Thurday";
    }
else    if(number == 5) {
    day="Friday";
    }
    else if(number == 6) {
day="Satuday";
}
else if(number == 7) {
    day="Sunday";
    } 
    else day="Invalid!!";
    
    System.out.println("Day is : "+day);
    
    
    }
  }


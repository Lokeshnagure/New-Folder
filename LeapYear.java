
import java.lang.*;
import java.util.*;

public class LeapYear {
    public static void main(String arg[]){

        int year ;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Year : ");
        year = sc.nextInt();
        sc.close();

      if((year % 4==0) || ((year %400 == 0)&& (year %100 !=0)) ) {
        System.out.println("Leap Year : " + year);

      }
      else System.out.println("Not Leap Year : " + year);



    }

}
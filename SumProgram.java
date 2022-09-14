import java.util.*;

public class SumProgram {
    public static void main(String ar[]){
        
        int a ;
        int b ;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b =sc.nextInt();
        sc.close();
        System.out.println("Please Enter Number To Do SUM :");
        int sum = a + b ;

        System.out.println("SUM : " + sum);
    }
}
import java.util.Scanner;

public class FindingWebsiteType {
    public static void main(String ar[]){

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        int sLen = website.length();
        int indexOfColon = website.indexOf(':');

        //Finding protocol of website
        System.out.println("Protocol of Website : " + website.substring(0,indexOfColon));
        



    }
    
}
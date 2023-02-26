package helloworld;
import java.util.Scanner; 
public class ScannerInput {
    public static void main(String[] args) {
        
     Scanner scnr = new Scanner(System.in);
     
     System.out.println("What's your name?");
     String name1 = scnr.next();
     
     System.out.println("How old are you?(integer years)");
     int age = scnr.nextInt();
     
     System.out.println("What year is it?");
     int year = scnr.nextInt();
     int birthYear = year - age ;
     
     System.out.println(name1 + " , if you're" + age +" years old, you were probably born in" + birthYear);
     scnr.close();
    }
}
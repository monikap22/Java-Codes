package helloworld;

import java.util.Scanner;

public class IfElseExtentedStatement {
	
    public static void main(String[] args) {
    	
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Please enter your score: ");
        
        int score = scnr.nextInt();
        
        if (score >= 90) {
        	
            System.out.println("You got an A!");
            
        } else if (score>=80) {
        	
        	System.out.println("You got a B.");
        	
        } else if (score>=70) {
        	
        	System.out.println("You got a C.");
        	
        }else if (score>=60) {
        	
        	System.out.println("You got a D.");
        
        } else {
        	
            System.out.println("You failed :(");
        }
       
        scnr.close();
      
    }
}

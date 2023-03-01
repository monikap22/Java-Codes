package helloworld;

public class ForLoops {

	public static void main(String[] args) {
	//The For Loop below counts from 1 to 10
		//Modify it to count the following ways:
		// 2,4,6,8,10
		// 1,2,4,8,16,32,64,128
		// 100,99,98....1
		
		
		for(int i = 1; i <= 10; i++) {
         System.out.print(++i + ", ");
		}
		
		System.out.println();
		
		for (int b = 1; b <= 128; b *=2) {  
			System.out.print(b + ", ");
		}
		
	
		System.out.println();
		
		for (int c =100; c >=1;c--) {
		
			System.out.print(c + ",");
		}
		
	}
}
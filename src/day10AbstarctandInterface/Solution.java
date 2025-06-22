package day10AbstarctandInterface;



import java.util.Scanner;

public class Solution {
	 
	  void elligible(){
		  try { 
			  Scanner scan = new Scanner(System.in);
			  
			  int age = scan.nextInt();
		 
		  if (age>=18) {
			  System.out.println("elligble");
			  
		  }
		  else {
			  throw new Exception ("you are not eligible");  
		  }
		 
	  }
	 catch(Exception e) {
		 System.out.println(e);
	 }
		 
	 }
	  
	public static void main(String[] args) {
		Solution obj = new Solution();
		obj.elligible(); 
		

	}

}


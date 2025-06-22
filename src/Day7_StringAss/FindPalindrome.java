package Day7_StringAss;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String words= scan.nextLine();
		
		String reverse ="";
		for(int i=words.length()-1;i>=0;i--) 
		{
			reverse=reverse+words.charAt(i);
	
		}
		System.out.println(reverse);
		if(words.equals(reverse)) {
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		
		
		
	}

}

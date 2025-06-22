package Day_6String;

import java.util.Scanner;

public class ReturnKey {
	 
	public static int MRP = 500;
	public static int payment() {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the amount = ");
		int amount =scan.nextInt();
		return amount;
	}
	static void validation( int amount) {
		if(amount<MRP) {
			int pending=MRP-amount;
			System.out.println("Amount pending = "+pending);
		}
		else if(amount>MRP) {
			int remain = amount-MRP;
			System.out.println("Remaing to given = "+ remain);
		}
		else
		{
			System.out.println("Exact amount paid");
		}
		
	}

	public static void main(String[] args) {
		 int amount =payment();
		ReturnKey.validation( amount);
		
	
	}

}

package Day_5Array;

import java.util.*;

public class StoreArraybyScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter = ");
			a[i]=scan.nextInt();
			System.out.println(a[i]);
			
		}
		System.out.println(Arrays.toString(a));
	}

}

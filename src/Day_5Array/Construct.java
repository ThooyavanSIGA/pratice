package Day_5Array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class  Construct{
	
	int a;
	int b;
	Construct(){
		this.a=10;
		this.b=1;
		
	}
//	Construct( int c,int d){
//		System.out.println(c+d);
//	}
	static int add() {
		int a=20;
		int b=15;
		return a+b;
	}
int sub() {
		
		System.out.println(add());
		return a-b;
	}
//	Construct(int a,int b){
//		System.out.println(a+b);
//		
//	}
	

	public static void main(String[] args) {
		Construct obj =new Construct();
		obj.sub();
		Integer myInt = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	 
	    System.out.println(myInt);

	}

}

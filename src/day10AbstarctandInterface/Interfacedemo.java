package day10AbstarctandInterface;

interface Interfacedemo {
	int a=10;
	int b =10;
	
	void add();
	
	
	default void sub() {
		System.out.println("sub = "+(a-b));
	}
	default void mult() {
		System.out.println("multi = "+(a*b));
		
	}

	
		
	}
interface inter{
	void add();
	
}

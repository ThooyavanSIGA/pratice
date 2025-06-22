package day10AbstarctandInterface;

public class addition implements inter,Interfacedemo{
	public void add() {
		System.out.println("adding = "+(a+b));
		
	}
	 void div() {
		System.out.println("divide = "+(a/b));
	}
	 public void sub() {
		System.out.println("sub = "+(a-b));
	}

	public static void main(String[] args) {
		addition obj =new addition();
		obj.add();
		
		

	}

}

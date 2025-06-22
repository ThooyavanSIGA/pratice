package day8_classandObj;

public class StoreDataBymethod {
	int A;
	int B;
	int C;
	
	
	void data(int a,int b,int c) {
		A=a;
		B=b;
		C=c;
		
	}
	int add() { 
		return A+B+C;
		
	}
	int sub() {
		return A-B-C;
	}
	int mult() {
		return A*B*C;
	}
}

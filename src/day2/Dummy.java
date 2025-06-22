package day2;

public class Dummy {
	int english = 90;
	int tamil = 55;
	int maths = 77;
	int science = 98;
	int social =23;
	int total =(english+tamil+maths+science+social);
	
	void grades() {
		int english=100;
		if(total >=350) {
			System.out.println("result");
			
		}
	
		int totals=english+tamil;
		System.out.println(totals);
		//System.out.println(name.hashCode());
		
		
	}
	void name () {
		int mark = social+english;
		System.out.println(mark);
	}
public static void main(String as[]) {
 Dummy obj =new Dummy();
 //System.out.println(obj.hashCode());
 obj.grades();
 obj.name();
 
}
}

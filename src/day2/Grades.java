package day2;

public class Grades {
	int english = 90;
	int tamil = 55;
	int maths = 77;
	int science = 98;
	int social =23;
	int total =(english+tamil+maths+science+social);
	
	void grades() {


if(total>=450) {
	System.out.println("Scored O+ Grade");
}
else if(total<450&&total>400) { //true and true =true
	System.out.println("Scored A Grade");
}
else if(total<=400&&total>300) {
	
	System.out.println("Scored B Grade");
}
else if (total<=300&& total>200) {
	System.out.println("Scored C Grade");
}
else
{System.out.println("No Grade");

}

}}

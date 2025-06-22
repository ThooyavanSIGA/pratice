package day4_looping;

public class Countdigit {

	public static void main(String[] args) {
int number=4563;
int result=0;
while(number!=0) {
	int last_num = number%10;
	int answer=result*10+last_num;
	number=number/10;
	{
System.out.print(answer);
	}
}
	

}}

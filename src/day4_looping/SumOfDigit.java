package day4_looping;

public class SumOfDigit {

	public static void main(String[] args) {
    int number=12345;
    
    while(number!=0) {
    	int last_no=number%10;
    	number=number/10;
    	int result=+last_no;
    
    System.out.print(result);

	}

}}

package day4_looping;

public class CountNum {

	public static void main(String[] args) {
		int num=123456;
	int count=0;
		while(num!=0)
		{
			num=num/10;
			count=count+1;
		}
		{if(count%2==0) {
		System.out.println("even"+count);
		}
		else
		{System.out.println("odd"+count);
		
		}
		
	}

}}

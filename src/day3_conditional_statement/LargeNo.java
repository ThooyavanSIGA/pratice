package day3_conditional_statement;

public class LargeNo {

	public static void main(String[] args) {
		int a=89898,b=476478;
		/*if(a>b)
		{
			System.out.println("Greater no is = "+a);
		}
		else
		{
			System.out.println("Greater no is = "+b);
		}*/
		int result=(a>b)?a:b;
		System.out.println(result);
	}

}

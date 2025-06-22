package day3_conditional_statement;

public class SmallNo {

	public static void main(String[] args) {
		int a=455,b=355,c=3554,d=456;{
		if(a<b&&a<c&&a<d) {
			System.out.println("Smaller no = "+a);
		}
		else if (b<a&&b<c&&b<d) {
			System.out.println("Smaller no = "+b);
		}
		else if (c<a&&c<b&&c<d) {
			System.out.println("Smaller no = "+c);
		}
		else
		{
			System.out.println("Smaller no = "+d);
		}
		}
	}

}

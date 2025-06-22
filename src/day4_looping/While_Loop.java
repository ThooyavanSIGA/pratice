package day4_looping;

public class While_Loop {

	public static void main(String[] args) {
		/*syntax:
			initialization
			while(condition) {
				statement;
				increment/decrement;
			}*/
		int u=1;
		while (u<=5) {
			System.out.println("printed"+u);
			u=u+2;
		}
		int i=1;
		while(i<=10)
		{
			System.out.println("odd numbers are = "+i);
			i=i+2;
		}
	}

}

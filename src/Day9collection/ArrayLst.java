package Day9collection;
import java.util.*;

public class ArrayLst {

	public static void main(String[] args) {
		ArrayList num =new ArrayList();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(3);
		System.out.println(num);
		ArrayList num1 =new ArrayList();
		num1.add(3);
		num.removeAll(num1);
		System.out.println(num);
		num.add(2,3);
		num.add(3,3);
		System.out.println(num);
	

		

	}

}

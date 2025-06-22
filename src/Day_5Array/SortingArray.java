package Day_5Array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		String names[]= {"thooie","rajesh",
				        "dilip",};
		
		System.out.println("before sort " +Arrays.toString(names));
		Arrays.sort(names);
      System.out.println(Arrays.toString(names));
	}

}

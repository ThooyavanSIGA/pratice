package Day_6String;

import java.util.Arrays;

public class memoryAlloc {

	public static void main(String[] args) {
//		String a=" he llooo";
//	String b =new String("hi");
//	System.out.println(System.identityHashCode(a) +" "+System.identityHashCode(b));
//System.out.println(a.contains("he l"));
//		String amount= "$400,540,00";
//		String rupees = amount.replace("$", "").replace(",","");
//	    int kasu = Integer.parseInt(rupees);
//		System.out.println("RS"+kasu);
		/*String a = "abc,123@xyz";// abc 123 xyz
		String[]b = a.split(",");
		System.out.println(Arrays.toString(b));
		String last[]= b[1].split("@");
		System.out.println(Arrays.toString(last));
		String fin =b[0]+" "+last[0]+" "+last[1];
		System.out.println(fin);
		
		StringBuilder sb = new StringBuilder();
		for (char ch : a.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				sb.append(ch);
				
				
				
			}
		}
		System.out.println(sb);
		
	*/
		
		String a ="th";
		System.out.println(a.hashCode());
		String b = new String("th");
		System.out.println(b.hashCode());
 		
	}

}

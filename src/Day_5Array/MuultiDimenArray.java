package Day_5Array;

public class MuultiDimenArray {

	public static void main(String[] args) {
		int a[] []= {
				{100,101,102},
				{200,201,202},
				{300,301,302}
		         };
		
//		for(int r=0;r<=a.length-1;r++)
//		{
//			for(int c=0;c<=a[r].length-1;c++) {
//			
//				System.out.print(a[r][c]+" ");
//				
//			}
//			System.out.println(" ");
//		}
//		enhced for loop
		for(int array[]:a) 
		{
			for(int x:array) {
				System.out.print(x +" ");
				
			}
			System.out.println();
		}
	}

}

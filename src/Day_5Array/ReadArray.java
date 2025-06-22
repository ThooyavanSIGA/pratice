package Day_5Array;

public class ReadArray {

	public static void main(String[] args) {
		/*method 1
		int a[]=new int[4];
		 a[0]=1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 
		 System.out.println(a[3]);
		 */
		 //method 2
		int a[]= {1,2,3,4,5,6,7,8,9};
		//System.out.println(a[3]);
		//print certain value use for loop
//		for(int i=2;i<=3;i++)
//		{
//			System.out.println(a[i]);
//		
//		}
		//each loop or enchaned for loop
		for(int finall:a)
		{
			
			System.out.println(finall);
		
		}
		  
		
		

	}

}

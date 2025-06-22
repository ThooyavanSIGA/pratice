package Day_5Array;

public class searching {

	public static void main(String[] args) {
		int number[] = {0,1,2,4,5,6,1,0,2};
		int find_no = 2;
		boolean result=false;
		int count=0;
		
		
			for(int i=0;i<number.length;i++) //for(int x:number)
			{
				if(number[i]==find_no) 
				{
					//System.out.println("is there");
					result=true;
					count=count+1;
					
				}
				 
				}System.out.println("total repeat = "+count);
				
			if (result==false) {
				
				System.out.println("not there ");
			}
			
				
			
			
			
	}
	}



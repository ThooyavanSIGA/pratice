package Day7_StringAss;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int []arr2 = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			 arr2[i]= arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arr2));
/*int temp=0;
int []arr = {1,2,3,4,5,6};
int l=arr.length;
int start=0;
int end=l-1;
while(start<end) {
	temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
	
	
	
}
for(int a:arr) {
	System.out.println(a);
}
*/
	}}



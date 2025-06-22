package Day_5Array;

public class ObjectArray {

	public static void main(String[] args) {
		Object values[][]= {{1,10.1},{"name",'A'}};
		for(int r=0;r<values.length;r++) {
			for(int c=0;c<values[r].length;c++)
			{
				System.out.print(values[r][c]+" ");
			}
			System.out.println("");
		
		}

	}

}

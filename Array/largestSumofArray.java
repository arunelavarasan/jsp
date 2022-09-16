//WAP to print largest sum of array
package Array;

public class largestSumofArray {

	public static void main(String[] args) {
		int [][] a = {{2,4,5},{1,2,4},{4,7,8}};
		int max = 0;
		for(int i = 0;i<a.length;i++)
		{	
			int sum = 0;
			for(int j = 0;j<a[i].length;j++)
			{
				sum = sum + a[i][j];
			}
			if(sum > max)
			{
				max = sum;
			}
		}
		System.out.print(max);
	}
}

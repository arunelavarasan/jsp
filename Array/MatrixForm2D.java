package Array;

public class MatrixForm2D {

	public static void main(String[] args) {
		int [][] a = {{2,4,5},{1,2,4},{4,7,8}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

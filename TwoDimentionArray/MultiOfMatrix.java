//WAP to multiply two matrix
package TwoDimentionArray;

public class MultiOfMatrix {

	public static void main(String[] args) {
		int [][] a = {	{5,4,2},
						{1,9,3},
						{7,6,11} };
		
		int [][] b = {  {3,4,5},
						{1,2,6},
						{2,1,3}  };
		for (int i = 0; i < a.length; i++) {//rows
			for (int j = 0; j < b[i].length; j++) {//column
				int sum = 0;
				for (int k = 0; k < b[i].length; k++) {//elements
					sum = sum + a[i][k]*b[k][j];
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
//|5  4   2 |   | 3  4  5 |     | 23 30 55 |   
//|1  9   3 | x | 1  2  6 |  =  | 18 25 68 |
//|7  9   11|   | 2  1  3 |     | 49 51 104|
//for(rows)
//for(columns)
//for(elements)

//00x00   +  00x01  +  00x02   5x3+4x1+2x2 = 23  
//01x10   +  01x11  +  01x12   5x4+4x2+2x1 = 30
//02x20   +  02x21  +  02x22   5x5+4x6+2x3 = 55 




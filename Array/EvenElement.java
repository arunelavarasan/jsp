//WAP to print even element in the array
package Array;

public class EvenElement {

	public static void main(String[] args) {
		int[] a = {21,22,13,3,10};
		for(int i = 1; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i] + " ");
			}
		}
	}

}

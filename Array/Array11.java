//WAP to find smallest no in the array
package Array;

public class Array11 {

	public static void main(String[] args) {
		int a [] = {7, 1, 8, 5, 6, 2};
		int small = a[0];
		for(int i = 1 ; i<a.length; i++)
		{
			if(a[i]<small)
			{
				small = a[i];
			}
		}
		System.out.println("The smallest no is: "+small);
	}
}

//WAP to sort the character in ascending
package Sorting;

public class Insertion1 {

	public static void main(String[] args) {
		char[] a = {'J','S','P','I','D','E','R'};
		for(int i = 1 ; i<a.length ;i++)
		{
			char temp = a[i];
			int j = i;
			while(j>0 && temp<a[j-1])
			{
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp;
		}
		for( int i = 0;i<a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}

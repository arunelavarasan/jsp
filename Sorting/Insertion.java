package Sorting;

public class Insertion {
	public static void main(String[] args) {
		int a[] = {273, 43, 22, 21, 53, 32, 76};
		for(int i = 1; i<a.length;i++)
		{
			int temp = a[i];
			int j = i;
			while(j>0 && temp<a[j-1])
			{
				a[j] = a[j-1];
				--j;
			}
			a[j] = temp;
		}
		for(int i = 0 ; i<a.length; i++)
		{
		   System.out.print(a[i] + " ");	
		}
	}
}

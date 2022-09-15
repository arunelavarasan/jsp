//WAP to find second largest no
package Array;

public class Array12 {

	public static void main(String[] args) {
		int [] a = {7, 1, 8, 5, 6, 2};
		int large = a[0];
		int slarge = 0;
		for(int i = 1 ;i<a.length ; i++)
		{
			if(a[i]>large)
			{
				slarge = large;
				large = a[i];
			}
			else if(a[i]>slarge && a[i]!=large)//if large element is present at 0 index and for duplicate large element
			{
				slarge = a[i];
			}
		}
		System.out.println(large);
		System.out.println(slarge);
	}
}


//WAP to search the element in an array
package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a = {3, 4, 1, 5, 2, 6};
		int search = 2;
		boolean b = true;//not present
		for(int i = 0 ; i<a.length ;i++)
		{
			if(a[i]==search)
			{
				System.out.println("The element is present"+search);
				b = false;
				break;
			}
		}
		if(b == true)
		{
			System.out.println("The element is not present");
		}
	}

}

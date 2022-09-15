//Binary Search
package Searching;

public class Binary_Search {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int search = 5;
		int li = a[0];
		int hi = a.length-1;
		int mi = (li+hi)/2;
		while(li<=hi)
		{
			if(a[mi] == search)
			{
				System.out.println("The element is present at : "+mi);
				break;
			}
			else if(search>a[mi])
			{
				li = mi + 1;
			}
			else if(search<a[mi])
			{
				hi = mi -1;
			}
			mi = (li + hi)/2;
		}
		if(li>hi)
		{
			System.out.println("The element is not found");
		}
	}
}

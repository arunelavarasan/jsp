//WAP to find the largest no in the array
package Array;
public class Array10 {

	public static void main(String[] args) {
		int [] a = {7, 1, 8, 5, 6, 2};
		int large = a[0];//8
		for(int i = 1 ; i<a.length;i++)
		{
			if(a[i]>large)
			{
				large = a[i];
			}
		}
		System.out.println("The largest element is: "+large);
	}
}
//1st we have to store first element in one var
//Than we have to compare the element with all other element in array
//if the no is greater then store it into that var
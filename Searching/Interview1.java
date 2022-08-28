
package Searching;

//Shortcut Preferable
public class Interview1 {

	public static void main(String[] args) {
		int[] n = {5 , 9, 12, 16, 25};
		int k = 6;
		int sum = 0;
		for(int i = 0; i<n.length;i++)
		{
			
			if(n[i]%k != 0)
			{
				sum = sum + (n[i]%k);
			}
		}
		System.out.println(sum);
	}
}
//5  4,5,3,2,1 = 0%6 = 0
//9  9,8,7,6  = 6%6 = 0
//12 12%6 = 0
//16 16,15,14,13,12 12%6 = 0
//25 25,24  24%6 = 0


//Normal Method
class Alternate{
	public static void main(String[] args)
	{
		int[] a = {5 , 9, 12, 16, 25};
		int n = 6;
		int count = 0;
		for(int i = 0;i<a.length;i++)
		{
			while(a[i]%n!=0)
			{
				--a[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
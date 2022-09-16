package Array;

public class Zig_zag {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = new int[a.length];
		int k = 0;
		for(int i=0;i<a.length;i++)
		{
			if(k<a.length && k%2==0)
			{
				b[k] = a[i];
				k+=2;
			}
		}
		k = 1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(k<a.length && k%2!=0)
			{
				b[k] = a[i];
				k+=2;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
	}
}
//1 5 2 4 3
//zig-zag manner : smaller element bigger element
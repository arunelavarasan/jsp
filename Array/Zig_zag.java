package Array;

public class Zig_zag {

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 4, 2};
		int [] b = sort(a);
		int [] c = new int[a.length];
		for(int i = 0;i<a.length;i++)
		{
			if(i%2 == 0)
			{
				c[i] = b[i];
			}
			else if(i%2 !=0){
				c[i] = b[i];
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(c[i]);
		}
	}
	public static int[] sort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j = i;
			while(j>0 && temp<a[j-1])
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		return a;
	}
}
//1 5 2 4 3
//zig-zag manner : smaller element bigger element
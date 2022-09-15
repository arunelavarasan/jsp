//WAP to find good-bad array
package Array;

public class GoodArrayBadArray {

	public static void main(String[] args) {
		int [] a = {1, 0, 1, 5, 8, 7, 0, 1, 1};
		int bad = 0;
		int good = 0;
		int b[] = new int[a.length];
		int k = a.length-1;
		for(int i=0; i<b.length;i++)
		{
			b[i] = a[k];
			k--;
		}
		for(int i=0;i<b.length;i++)
		{
			if(a[i] == b[i])
			{
				good = good + a[i];
			}
			else {
				bad = bad + a[i];
			}
		}
		System.out.print(good-bad);
	}

}

























/*
 * { int [] a = {1, 0, 1, 5, 8, 7, 0, 1, 1}; int bad = 0; int good = 0; for(int
 * i = 0;i<a.length/2;i++) { if(a[i] != a[a.length-1-i]) { int temp = a[i]; a[i]
 * = a[a.length-1-i]; a[a.length-1-i] = temp; bad = bad + a[i] +
 * a[a.length-1-i]; } else if(a[i] == a[a.length-1-i] || a[(i+1)%a.length] !=0){
 * good= good + a[i] + a[a.length-1-i]; } } System.out.print(good); }
 */



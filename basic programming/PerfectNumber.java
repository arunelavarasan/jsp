//WAP to check weather the no. is perfect no or not
package jsp;

public class PerfectNumber {
	public static void main(String[] args) {

		int n=6;
		int sum=0;
		{
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			System.out.println("It is perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}
	  }
	}
}
//6 = 1+2+3 = 6
//28 = 1 + 2 + 4 + 7 + 14 = 28

//WAP to find to Armstrong no.
package jsp;

public class Amstrong {
	
	public static int pow(int n, int p)
	{
		int res = 1;
		for(int i = 1;i<=p; i++)
		{
			
			res = res*n;
		}
		return res;
	}
	public static int countDigit(int n) {
		int count = 0;
		while(n!=0)
		{
			count++;
			n = n /10;
		}
		return count;
	}
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int count = countDigit(n);
		int sum = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + pow(d, count);
			n = n /10;
		}
		if(temp == sum)
		{
			System.out.println("it is armstrong number");
		}
		else {
			System.out.println("it is not armstrong number");
		}
	}

}

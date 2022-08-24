//WAP to find all the strong number from 1-100
package jsp;

public class StrongNoFrom1_10 {

	public static int factorial(int d)
	{
		int fact = 1;
		for(int i = 1; i<= d ; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		for(int n = 1; n<1000; n++)
		{
			int temp = n;
			int sum = 0;
			while(n!=0)
			{
				int d = n%10;
				sum = sum + factorial(d);
				n = n/10;
			}
			n = temp;
			if(n == temp)
			{
				System.out.println("Strong no"+temp);
			}
		
		}
	}
}

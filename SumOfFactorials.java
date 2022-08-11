//WAP to print the sum of all the factors of a no.
package jsp;

public class SumOfFactorials {
	public static void main(String[] args)
	{
		int n=17,sum=0;
		int i;          
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
	     	System.out.println("the no is perfect no: "+sum);
		}
		else
		{
			System.out.println("not perfect no");
		}
		
	}
}

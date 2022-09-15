//WAP to find all the prime number in the range from 1-100
package jsp;

public class PrimeNo1to100 {
	int n=100;
	int count=0;
	{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
		if(count==2)
		{
			System.out.println(i);
		}
	}
	}
}

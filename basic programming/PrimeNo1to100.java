//WAP to find all the prime number in the range from 1-100
package jsp;

public class PrimeNo1to100 {
	int n = 100;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
}

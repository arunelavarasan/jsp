package jsp;

public class PerfectNumber {
	int i;
	int n=100;
	int count=0;
	int sum=0;
	{
	for(i=1;i<n;i++)
	{
		for(int j=1;j<=i;i++)
		{
			if(i%j==0)
			{
				count++;
			}
			if(sum==n)
			{
				System.out.print(sum);
			}
		}
	}
	}
}

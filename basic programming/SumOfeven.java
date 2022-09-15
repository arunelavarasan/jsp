//WAP to find the sum of all the even no. in the range 1-10
package jsp;

public class SumOfeven {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i; //1+1=2 2+4=6 6+6=12 12+8=20 20+10=30
			}
		}
		System.out.println(sum);
	}
}
//WAP to print all the factors of the number 
package jsp;

public class Factors {
	public static void main(String[] args)
	{
		int n = 6;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
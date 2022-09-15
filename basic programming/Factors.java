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
//number is 6 
//6%1 = 0
//6%2 = 0
//6%3 = 0
//6%3 !=0
//6%4 !=0
//6%5 !=0
//6%6 = 0     
//the factors of the numbers are 1, 2, 3, 6
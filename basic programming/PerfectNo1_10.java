package jsp;

public class PerfectNo1_10 {

	public static void main(String[] args) {
	 for(int n = 1;n<=1000;n++)
	 {
		int sum = 0;
		for(int i = 1;i<n;i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			System.out.println(sum);
		}
	 }
   }
}
/*
6 = 1+2+3 = 6 
28 = 1 + 2 + 4 + 7 + 14 =28
496 = 1 + 2 + 4 + 8 + 16 +....... = 496 */

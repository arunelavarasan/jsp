package jsp;

public class sperateODD2 {
	public static void main(String[] args) {
		int n = 233423;
		int d = 0;
		int sum=0;
		while(n!=0)
		{
			d = n%10;
			sum=sum+d;
			if(d%2==0)
			{
				System.out.println(sum);
			}
			n=n/10;
		}
	}
}

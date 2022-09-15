package jsp;

public class P1 {

	public static void main(String[] args) {
		int n = 7289;
		int sum = 0;
		while(n!=0 || sum >=10)
		{
			if(n == 0)
			{
				n = sum;
				sum = 0;
			}
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}
		System.out.println(sum);
	}
}

//55 = 5+5 = 1 + 0 = 1
//7289 = 7+2+8+9 = 27 = 2+7 = 9

//WAP to convert binary to hexadecimal
package NumberConversion;

public class BinToHex {

	public static void main(String[] args) {
		int n = 11010;
		int sum = 0;
		int p = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d*pow(2,p++);
			n = n/10;
		}
		n = sum;
		System.out.println(hex(n));
	}

	public static int pow(int n, int p) {
		int prod = 1;
		for(int i = 1;i<p; i++)
		{
			prod = prod * n;
		}
		return prod;
	}
	public static String hex(int n)
	{
		String hex = "";
		while(n!=0)
		{
			int rem = n%16;
			switch(rem)
			{
			case 10 : hex = "a" + rem;
			break;
			case 11 : hex = "b" + rem;
			break;
			case 12 : hex = "c" + rem;
			break;
			case 13 : hex = "d" + rem;
			break;
			case 14 : hex = "e" + rem;
			break;
			case 15 : hex = "f" + rem;
			break;
			default:  hex = hex + rem;
			break;
			}
			n = n/16;
		}
		return hex;
	}
}

//WAP to convert bin to decimal
package NumberConversion;

public class BinToDec {

	public static void main(String[] args) {
		int n = 1100;
		int sum = 0;
		int p = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d*pow(2 ,p++);
			n = n/10;
		}
		System.out.println(sum);
	}

	public static int pow(int n, int p) {
		int res = 1;
		for(int i = 1;i<=p;i++) {
			res = res*n;
		}
		return res;
	}
}
//logic 
//1100     =    1x2^3 + 1x2^2 +  0x2^1 +  0x2^0   = 12

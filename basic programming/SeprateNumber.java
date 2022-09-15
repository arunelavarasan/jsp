//WAP to separate the number
package jsp;

public class SeprateNumber {
	public static void main(String[] args) {
		int n = 182;
		while(n!=0)
		{
			int d = n%10;
			System.out.println(d);
			n = n / 10;
		}
	}
}

//logic
//182%10=2    182/10=18
//18%10=8     18/10=1
//1%10=1      1/10=0
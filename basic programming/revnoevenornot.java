//WAP to check reverse of number even or not
package jsp;

public class revnoevenornot {
	public static void main(String[] args) {
		int n = 345;
		int rev = 0;
		while(n!=0)
		{
			int d = n%10;
			rev = rev*10 + d;
			n = n/10;
		}
		if(rev%2==0)
		{
			System.out.println("revese no is even");
		}
		else {
			System.out.println("revese no is not even");
		}
	}
}

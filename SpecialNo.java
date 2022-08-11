//Special number
package jsp;

public class SpecialNo {
	public static void main(String[] args) {
		int n = 19;
		int temp1=n;
		int pro=1;
		int sum=0;
		int temp2=0;
		while(n!=0)
		{
			int d = n%10;
			pro = pro*d;
			sum = sum + d;
			temp2 = pro+sum;
			n = n/10;
		}
		if(temp1==temp2)
		{
			System.out.println("it is special number");
		}
		else {
			System.out.println("it is not special number");
		}
	}
}

//19 :  (1+9) + (1x9) = 19

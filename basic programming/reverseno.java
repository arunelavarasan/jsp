package jsp;
//WAP to reverse number
public class reverseno {

	public static void main(String[] args) {
		int n = 234;
		int rev = 0;
		while(n!=0)
		{
			int d = n%10;
			rev = rev*10 + d;
			n = n/10;
		}
	   System.out.println(rev);
	}
}

/*
  n!=0            n%10           rev x 10 + d     n/10
  185!=0t         185%10         0 x 10 + 5       185/10
  18!=0t		  18%10          5 x 10 + 8       18/10
  1!=0t			  1%10           58 x 10 + 1      1/10
  0!=0f           
*/
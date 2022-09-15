package String;

public class ReverseWord {

	public static void main(String[] args) {
		String s = "Welcome to Jspider";
		String[] a = s.split(" ");
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}
	}
}

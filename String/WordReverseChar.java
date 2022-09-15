package String;

public class WordReverseChar {

	public static void main(String[] args) {
		String a = "Welcome to Jspider";
		String rev = "";
		for(int i = a.length()-1; i>=0;i--)
		{
			rev = rev + a.charAt(i);
		}
		String[] b = rev.split(" ");
		for(int i = b.length-1;i>=0;i--)
		{
			System.out.print(b[i] + " ");
		}
	}
}

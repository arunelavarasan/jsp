package String;

public class StringPalinrome {

	public static void main(String[] args) {
		String s = "    level    ";
		s = s.trim();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}

//WAP to print reverse of string
package String;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Jspider";
		String rev = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
//to find total length of String we have length()
//charAt to print particular character present in String
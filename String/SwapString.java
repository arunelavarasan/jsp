//WAP to swap a string without using 3rd variable using substring
package String;

public class SwapString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Before swapping");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat(s2);
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println(s1);
		System.out.println(s2);
	}
}

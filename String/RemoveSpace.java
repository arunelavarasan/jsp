//WAP to remove all the space form string
package String;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "Remove Space in the sentence";
		String out = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!= ' ')
			{
				out = out + s.charAt(i);
			}
		}
		System.out.println(out);
	}
}

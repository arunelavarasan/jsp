package String;

public class InterviewQ2 {
	public static void main(String[] args)
	{
		String s = "This my first string program";
		String [] c = s.split(" ");
		for(int i = 0;i<c.length;i++)
		{
			if(c[i].charAt(0)>='a' && c[i].charAt(0)<='z')
			{
				char temp = (char)(c[i].charAt(0)-32);
				c[i] = temp + c[i].substring(1);
				System.out.print(c[i] + " ");
			}
			else {
				System.out.print(c[i] + " ");
			}
		}
	}
}
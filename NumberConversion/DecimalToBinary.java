package NumberConversion;
//WAP to find binary value of an number
public class DecimalToBinary {

	public static void main(String[] args) {
		int n  = 12;
		String bin = "";
		while(n!=0)
		{
			int rem = n%2;
			bin = rem + bin;
			n = n/2;
		}
		System.out.println(bin);
	}

}

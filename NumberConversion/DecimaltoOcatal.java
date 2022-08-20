package NumberConversion;
//WAP to convert decimal to octal
public class DecimaltoOcatal {

	public static void main(String[] args) {
		int n = 45;
		String bin = "";
		while(n!=0)
		{
			int rem = n%8;
			bin = rem + bin;
			n = n/8;
		}
		System.out.println(bin);
	}
}

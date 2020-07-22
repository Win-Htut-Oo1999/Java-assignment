import java.util.Scanner;

public class ExchangeCharStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="";
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		char[] c = input.toCharArray();
		char first = c[0];
		c[0] = c[c.length - 1];
		c[c.length - 1] = first;
		input = new String(c);
		System.out.println("New String is "+input);



	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number:");
		String num1=br.readLine();
		int number1=Integer.parseInt(num1);
		System.out.println("Enter second number:");
		String num2=br.readLine();
		int number2=Integer.parseInt(num2);
		System.out.println("Enter operator");
		String op=br.readLine();
		char val=op.charAt(0);
		switch(val) {
		case '+':
			System.out.println("The result is "+(number1+number2));
			break;
		case '-':
			System.out.println("The result is "+(number1-number2));
			break;
		case '*':
			System.out.println("The result is "+(number1*number2));
			break;
		case '/':
			System.out.println("The result is "+(number1/number2));
			break;
		default:
			System.out.println("Invalid");


		}


	}


	}




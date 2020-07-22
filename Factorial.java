import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter input number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
      System.out.println("Factorial number of "+num+" is "+fact);
	}

}

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int n = 1;
		System.out.print("Enter a number ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				n++;
	   }
			System.out.println();
    }
  }
}
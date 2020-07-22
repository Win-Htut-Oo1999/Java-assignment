import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i);
			if(i%10==0) {
			 System.out.println();
			}


		}
	}
}


import java.util.Scanner;

public class BackWordStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=input.nextLine();
		char res=word.charAt(word.length()-1);
		System.out.println(res+""+word+""+res);

	}

}

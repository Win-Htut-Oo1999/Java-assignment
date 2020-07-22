import java.util.Scanner;

public class LowerToUpperCaseEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput="hello";
		String changeCase;
        System.out.println("Here a String: "+userInput);
        changeCase=userInput.replaceFirst("h","H");
        System.out.println("Here output: "+changeCase);
	}

}

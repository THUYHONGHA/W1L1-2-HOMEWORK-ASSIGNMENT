
import java.util.Scanner;

public class Prog4 {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a String: ");			
		String cReverse = scan.next();		
		int length = cReverse.length();
		System.out.print("Your reverse String is: ");
		for (int i=length - 1; i>=0;i--){
			char s = cReverse.charAt(i);
			System.out.print(s);
		}	
		scan.close();
	}

}

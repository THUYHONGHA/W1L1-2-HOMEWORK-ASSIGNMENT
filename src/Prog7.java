
public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the length of each string input from Command line arguments
		for (int i = 0; i < args.length; i++){
			System.out.println(args[i].length());
		}
		
		//Count the string inputs starts with ‘A’
		int count = 0;
		for (int i=0; i < args.length; i++){
			if (args[i].charAt(0)=='A' || args[i].charAt(0)=='a'){
				count++;
			}
		}
		System.out.println(count + " The string inputs start with \'A\'");
	}

}

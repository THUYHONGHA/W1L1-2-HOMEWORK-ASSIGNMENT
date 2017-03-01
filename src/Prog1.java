
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = RandomNumbers.getRandomInt(1, 9);
		//System.out.println(x);
		double pi = Math.PI;
		System.out.println("pi^x is " + Math.pow(pi, x));

		int y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("y^pi is " + Math.pow(y, pi));
		
	}

}

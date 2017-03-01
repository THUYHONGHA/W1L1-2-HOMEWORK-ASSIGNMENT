
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = (float) 1.27;
		float y = (float) 3.881;
		float z = (float) 9.6;
		
		int sum = (int)(x+y+z);
		System.out.println("Sum of x, y, z is " + sum);
		
		int sum1 = Math.round(x+y+z);
		System.out.println("Rounding the sum of x, y, z is " + sum1);
	}

}

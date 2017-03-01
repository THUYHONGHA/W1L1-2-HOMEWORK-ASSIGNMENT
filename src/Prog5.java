
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = RandomNumbers.getRandomInt(1, 99);
				switch (i) {
				case 0:
				case 2:
					System.out.print("\t  " + matrix[i][j] + "\t\t");
					break;
				case 1:
				case 3:
					System.out.print("\t+ " + matrix[i][j] + "\t\t");	
					
					break;
				default:
					
					break;
				}
			}
			System.out.println();
			if ( i%2 != 0){
				for (int k = 0; k < 4; k++){
					System.out.print("\t______\t\t ");
				}
				System.out.println("\n\n\n\n");
			}
		}
	
	}

}

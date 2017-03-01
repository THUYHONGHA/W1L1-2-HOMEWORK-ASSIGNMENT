
public class RemoveDups {

	public static void main(String[] args) {
		String[] originalString = { "horse", "dog", "cat", "horse", "dog" };
		
		StringBuilder strNew = new StringBuilder();
		strNew.append(originalString[0]);
	
		for (int i = 1; i < originalString.length-1; i++) {
			boolean isExist=false;
			for (int j = i - 1; j >=0; j--) {
				if (originalString[i].equals(originalString[j])){
					isExist=true;
					break;
				}				
			}
			if (isExist==false){
				strNew.append(","+originalString[i]);
			}
		}

		
		String abc = strNew.toString();
		String[] arr = abc.split(",");
		//System.out.println(arr.length);
		System.out.print("New array: ");
		System.out.print("[\"" + arr[0]+"\"");
		for (int i = 1; i < arr.length; i++) {
			System.out.print(",\""+arr[i]+"\"");
		}
		System.out.print("]");
	}

}

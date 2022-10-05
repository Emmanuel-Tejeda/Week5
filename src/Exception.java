
public class Exception {

	
	public static void main(String args[]) {
		
		try {
			int myInt = Integer.parseInt("");
		}catch(NumberFormatException nfe) {
			System.out.println("You cant pass letters, has to be integers only");
		}finally {
			System.out.println("In Finally");
		}
		
		
	}
}

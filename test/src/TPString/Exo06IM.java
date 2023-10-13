package TPString;

public class Exo06IM {
	
	
	public static String epc(String str) {
		// Initialize the result string.
		String res = "";
	
		// Check the first character of the input string.
		switch (str.charAt(0)) {
			case '0':
				res = "IM   0";
				break;
			case '1':
				res = "IM   1";
				break;
			case '2':
				res = "IM   2";
				break;
			case '3':
				res = "IM   3";
				break;
			case '4':
				res = "IM   4";
				break;
			case '5':
				res = "IM   5";
				break;
			case '6':
				res = "IM   6";
				break;
			case '7':
				res = "IM   7";
				break;
			case '8':
				res = "IM   8";
				break;
			case '9':
				res = "IM   9";
				break;
			default:
				res = "Unknown";
		}
	
		// Return the result string.
		return res;
	}
	

}

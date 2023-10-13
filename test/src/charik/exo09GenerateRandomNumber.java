/**
 * 
 */
package charik;

/**
 * @author HP
 *
 */
public class exo09GenerateRandomNumber {

	/**
	 * @param args
	 */
	public static void p(Object o) {
		System.out.println(o);
		
	}
	
	public static void main(String[] args) {

		int min=1,max=10;
		int random = (int) (min+ Math.random() * (max-min+1) );
		
		
		p("random number [1;10]  ---> "+random);
		
	}

}

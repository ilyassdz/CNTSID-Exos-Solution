/**
 * 
 */
package TPString;

/**
 * @author Charik
 *
 */
class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
/* //exo 0001 String Objects..
			String str = "Charik Abdessamie CNTSID 2023";
			
			p("%%str = 'Charik Abdessamie CNTSID 2023'");
			
			p("%charAt : Returns the char value at thespecified index ex 10 "+ str.charAt(10));
			
			p("%concat : Concatenates the specified string to the end of this string ");
			p(str.concat("Concatenates %%  ")) ;
			
			
			p("%contains : Returns true if and only if this string contains the specifiedsequence of char values." +str.contains("2023"));
			
		p("split : Splits this string around matches of the given ");
			p(str.split(" "));
			
			String t = (str+"      ....   ");
			p("%TRIM :" + t.trim());
*/
		//p(Exo06IM.epc("4050"));
		
		//print(new Demensional().exo07());
		
		//new Exo08CountVowelConsonante().countVowelConsonante("i Love Algeria");
		
	}

	public static void p(Object o) {
		System.out.println(o);
		
	}
	
	public static void p(String []s) {
		
		
		for(int i=0;i<s.length; i++)
		System.out.print (s[i] + " ");
		
		System.out.println();
	}
	
	public static void print(int [][]array) {
		
		
		for(int i=0;i<array.length; i++)
			{
			for(int j=0;j<array.length; j++)
		System.out.print (array[i][j] + " ");
			
			System.out.println();
			}
		
		System.out.println();
	}
}

package TPString;

public class Exo08CountVowelConsonante {
 
	public boolean isVowel(char c) {
		String voyel = "aeyuio";
		
		return voyel.contains(c+"");
	}
	public boolean isConsonante(char c) {
		String Consonante = "zrtypqsdfghjklmwxcvbn";
		
		return Consonante.contains(c+"");
	}
	
	void countVowelConsonante(String str) {
		p(str);
		
		str=str.toLowerCase();
		int Vowel=0,Consonante=0;
		 
		
		for(int i=0;i<str.length(); i++) {
			if( isVowel(str.charAt(i) ))
					Vowel++;
			else if( isConsonante(str.charAt(i)))
					Consonante++;
			
		}
		
		p("Vowel      = " + Vowel);
		p("Consonante = "+ Consonante);
		
	}

	public static void p(Object o) {
		System.out.println(o);
		
	}
	
	public static void p(String []s) {
		new Exo08CountVowelConsonante().countVowelConsonante("i Love Algeria");
	}
}

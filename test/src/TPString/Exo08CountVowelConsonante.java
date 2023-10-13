package TPString;
public class Exo08CountVowelConsonante {

    // Method to check if a character is a vowel.
    public boolean isVowel(char c) {
        String vowel = "aeyuio";
        return vowel.contains(c + "");
    }

    // Method to check if a character is a consonant.
    public boolean isConsonante(char c) {
        String consonant = "zrtypqsdfghjklmwxcvbn";
        return consonant.contains(c + "");
    }

    // Method to count vowels and consonants in a given string.
    void countVowelConsonante(String str) {
        p(str);

        // Convert the input string to lowercase to simplify character matching.
        str = str.toLowerCase();
        int Vowel = 0, Consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i)))
                Vowel++;
            else if (isConsonante(str.charAt(i)))
                Consonant++;
        }

        // Print the counts of vowels and consonants.
        p("Vowel      = " + Vowel);
        p("Consonant  = " + Consonant);
    }

    public static void p(Object o) {
        System.out.println(o);
    }

    public static void p(String[] s) {
        // Create an instance of the class and call countVowelConsonante with a sample string.
        new Exo08CountVowelConsonante().countVowelConsonante("i Love Algeria");
    }
}


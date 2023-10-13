package charik;

import java.math.BigDecimal;
import java.util.Scanner;

/*
calcul scientific utiliser C ou portran; java nest pas efficase also avec BigDecimal

*/
public class Calculator001 {
    
   static void p(Object o){
        System.out.println(o);
    }
    public Calculator001() {
        // Create a Scanner object for user input.
        Scanner scn = new Scanner(System.in);
    
        // Declare BigDecimal variables to store numbers and initialize the operator as "+".
        BigDecimal a, b;
        String s = "+";
    
        while (true) {
            p("Enter first num a\n");
            // Read the first number (a) from the user.
            a = scn.nextBigDecimal();
    
            p("Enter second num b\n");
            // Read the second number (b) from the user.
            b = scn.nextBigDecimal();
    
            p("1 or + for + " +
                    "2 or - for -" +
                    "3 or * for *" +
                    "4 or / for /");
    
            try {
                // Read the operator choice from the user's input.
                s = scn.nextLine();
                p("line = " + s);
    
                if (s.length() > 0) {
                    // Check the first character of the user's input.
                    switch (s.charAt(0)) {
                        case '1': case '+':
                            // Perform addition and print the result.
                            p("a + b = " + a.add(b));
                            break;
    
                        case '2': case '-':
                            // Perform subtraction and print the result.
                            p("a - b = " + a.subtract(b));
                            break;
    
                        case '3': case '*':
                            // Perform multiplication and print the result.
                            p("a * b = " + a.multiply(b));
                            break;
    
                        case '4': case '/':
                            // Perform division and print the result.
                            p("a / b = " + a.divide(b));
                            break;
    
                        default:
                            p("Invalid operator choice");
                    }
                } else {
                    p("Input error");
                }
    
            } catch (Exception e) {
                p(e.getMessage());
            }
        }
    }
    /*
     * Explanation:

The code defines a constructor named Calculator001. This constructor initializes a Scanner object (scn) to accept user input and declares BigDecimal variables for the first and second numbers (a and b). It also initializes the operator variable s with "+".

Inside a while loop, the program repeatedly prompts the user to enter two numbers (a and b) and an operator choice.

The operator choice is read as a string (s), and the code checks the first character of the string to determine which operation to perform: addition, subtraction, multiplication, or division.

Depending on the operator choice, the program performs the corresponding mathematical operation using BigDecimal methods (add, subtract, multiply, or divide) and prints the result.

If the user enters an invalid operator choice or an input error occurs, appropriate error messages are displayed.

The loop continues to prompt the user for input, making it a basic calculator that can perform these arithmetic operations until the program is terminated.

Please note that there is an issue in the code where the BigDecimal variables a and b are not correctly used for calculations in some cases (e.g., addition). You should replace b.add(b) with a.add(b) for addition and similarly for other operations.





     */
}

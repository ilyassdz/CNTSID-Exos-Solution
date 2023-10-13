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
    public  Calculator001() {
        Scanner scn = new Scanner(System.in);
        BigDecimal a,b;  // = new BigDecimal("");
        String s="+";

        
        while(true){
                p("Enter first num a\n");
                a= scn.nextBigDecimal();
                 p("Enter secend num b\n");
                 b= scn.nextBigDecimal();

                 p("1 or + for + "+
                 "2 or - for -"+
                 "3 or * for *"+
                 "4 or / for /"
                                  );
               
                 try {
                     s = scn.nextLine();
                     p("line = " + s);
                     if(s.length()>0)
                       switch(s.charAt(0)){

                        case '1':case '+': 
                        p("a + b = " + b.add(b));
                        break;

                        case '2': case '-':
                        p("a - b = " + a.subtract(b));
                        break;
                         case '3': case '*':
                        p(" a * b = " + a.multiply(b));
                        break;

                         case '4': case '/':
                        p(" a / b = " + a.divide(b));
                        break;

                       // default :goto  boocl; break;
                     }
                     else{
                        p("input errer");
                     }

                    
                } catch (Exception e) {
                    p(e.getMessage());
                   // goto boocl;
                }
               





        }
    }
}

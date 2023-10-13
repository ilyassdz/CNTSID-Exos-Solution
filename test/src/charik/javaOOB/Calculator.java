package charik.javaOOB;

import java.math.BigDecimal;
import java.math.RoundingMode;
 

public class Calculator {
     
   private BigDecimal number1,number2;

    @Override
    public String toString() {
        return "Calculator [number1=" + number1 + ", number2=" + number2 + "]";
    }
    public static void test(){
       // new  Calculator();

        Calculator a = new Calculator(new BigDecimal("1.000005"),new BigDecimal("2.000001"));

       
        a.add( ); System.out.println(a);

        a.subtract(); System.out.println(a);

        a.multiply(); System.out.println(a);

        a.divide(); System.out.println(a);

         System.out.println(a);




    }
    public Calculator() {
        System.out.println("No args constructor is called");
        if(number1.compareTo(BigDecimal.ZERO) ==0 )
            System.err.println("number 2 must !=0");

    }


    public Calculator(BigDecimal number1, BigDecimal number2) {
         this();

        this.number1 = number1;
        this.number2 = number2;

        System.out.println("Calculator constructor 2");
    }

    
    
    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }
    public void setNumber2(BigDecimal number2) {
        this.number2 = number2;
    }
    
    public BigDecimal getNumber1() {
        
        return number1;
    }
    public BigDecimal getNumber2() {
        return number2;
    }

    public BigDecimal add( ) {
       // System.out.println("Adding...  " + number1);

        return this. number1.add(number2);
    }
    public BigDecimal multiply( ) {
        return this. number1.multiply(number2);
    }
    public BigDecimal subtract( ) {
        return this. number1.subtract(number2);
    }

    public BigDecimal divide(   ) {
        if(number2.compareTo(BigDecimal.ZERO)==0)
            return null;

        return this. number1.divide(number2).setScale(2, RoundingMode.HALF_UP   );

    }


    
    

}

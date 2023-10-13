package polimorphism;

public class Programmer extends Employee {

    Programmer(){
        salaryPrDay = 10000;
    }
     
    @Override
    long calculateSalary(int days) {
        
        return 10*salaryPrDay * days;
    }





   
    
    public static void test(){
      System.out.println(  new Programmer().calculateSalary(28) );
     System.out.println(    new Manager().calculateSalary(30)   );

    }
    
}

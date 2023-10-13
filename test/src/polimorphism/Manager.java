package polimorphism;

public class Manager extends Employee {

    Manager(){
        salaryPrDay = 20000;
    }
  
    @Override
    long calculateSalary(int days) {
         
        return 5*salaryPrDay * days;
    }
    
}

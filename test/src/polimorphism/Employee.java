package polimorphism;

public class Employee {
    long salaryPrDay;
    String firstName,lastname;

    long calculateSalary(int days){

        return salaryPrDay * days;
    }
}

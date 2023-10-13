package charik.inheritance;

public class Personne {
       String firstName,lastName;
       
public static void test(){

    Employee employee = new Employee("Charik", "Abdessamie ","230676" , "Ingenieur CNTSID");
    System.out.println(employee);

}

    public Personne(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

 

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
}
class Employee extends Personne{
    
    @Override
    public String toString() {
         
        return "Employee id "+id +" "+ firstName  +" "+ lastName +" " + jobTitle;
    }

    public Employee(String firstName, String lastName, String id, String jobTitle) {
        super(firstName, lastName);
        this.id = id;
        this.jobTitle = jobTitle;
    }

   

    String id,jobTitle;

    public String getId() {
        return id;
    }

    @Override
    public String getLastName() {
             return super.getLastName() + "  Job title: " ;
    }
    
    

}

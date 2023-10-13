package charik.javaOOB;

public class Student {
    int id;
    String name;

   

    Student(int id,String name){
        //System.err.println("The construtor is called");

        

        this.id = id;
        this.name = name;

    }

    void display(){

    System.out.println(" Student id: " + id + " name: " + name);

    }

   public static void main(){
        
        Student s1 = new Student(111, "karan");
        Student s2 = new Student(222, "Aryan");

        s1.display();
        s2.display();

    }
}

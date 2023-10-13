package Encaplsulation;

public class Person {
   private String name,country;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
    static void test(){
        var p = new Person();
        p.setAge(30);
        p.setName("Abdessamie");
        
    }
}

package polimorphism;

public class Hawk extends Bird {

    @Override
   public void fly() {
         p("Hawk flying ....");
    }

    @Override
    void makeSound() {
        p("Hawk making sounds ....");
    }
    
    public static void test(){

        new Hawk().fly();
        new Eagle().makeSound();
        
    }
}

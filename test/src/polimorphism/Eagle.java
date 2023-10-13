package polimorphism;

public class Eagle extends  Bird {

    @Override
    public void fly() {
        p("Eagle flying ....");
    }

    @Override
    void makeSound() {
          p("Eagle making sounds ....");
    }
    
    
}

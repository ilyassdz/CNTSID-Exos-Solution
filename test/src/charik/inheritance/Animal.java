package charik.inheritance;

 

public class Animal{
     
   public static void testMethodOverriding(){
        Dog dog= new Dog() ;
        Cat cat = new Cat() ;
        Cow cow = new Cow();

        Animal a;
        a = new Animal();
        a.speak();

        ///dog = new Cat();

        


    }
         public static void test(){
        Dog dog = new Dog();
        dog.work();
        dog.printColor();

    }
     static void p(Object o){
                   
        System.out.println(o);     

    }
    String color = "white";
    Animal(){
       p("Animal is created");
    }
    void eat(){
        p("eating ..");
    }
     void speak(){
          System.out.println("Animal speaking!");  
        }

}

class Dog extends Animal{
    
    Dog(){
        super();
         color = "black";
        p("dog is created");

    }
    void bark(){
        p("barking");
    }
    void work(){
        super.eat();
        bark();
    }
    void printColor(){
        p(color);
        p(super.color);
    }
}
    class Cat extends Animal{
        void speak(){
          System.out.println("cat Meow!");  
        }
    }

       class Cow extends Animal{
        void speak(){
          System.out.println("cow Moo!");  
        }
    }

    


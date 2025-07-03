import java.util.*;
public class AbstractDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.eat();
        
    }
    
}
abstract class Animal{
    //abstract method
    abstract void sound();
    //non abstract method
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    void sound(){
    System.out.println("Dog barking");
    }
}


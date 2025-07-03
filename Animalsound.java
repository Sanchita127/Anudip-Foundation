import java.util.*;
class Animal{
    void makeSound()
    {
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{
    @Override
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}
class Cat extends Animal{
    @Override
    void  makeSound()
    {
        System.out.println("Dog Barks");
    }
}
public class Animalsound {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        Animal animal;
        
        switch (choice) {
            case 1:
               animal=new Cat();
               animal.makeSound();

            break;
            case 2:
               animal = new Dog();
               animal.makeSound();
               break;
        
            default:
            System.out.println("invalid Choice");
                break;
        }
        
    }
}

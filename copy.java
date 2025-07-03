import java.util.*;
class student{
    String name;
    int age;
    
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
       
    }
    student(student s)
    {
        name=s.name;
        age=s.age;
        
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
    }
}

public class copy{
    public static void main(String[] args) {
        student s1=new student("Shraddha",20);
        student s2= new student(s1);
       s1.display();
       s2.display();
    }
}

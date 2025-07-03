class student{
    String name;
    int age;

student(String name,int age)
{
    this.name=name;
    this.age=age;
}
student(student s){
    name=s.name;
    age=s.age;
}
void display(){
    System.out.println("name" +name);
    System.out.println("age" +age);
}
}


public class copy1 {
    public static void main(String[] args) {
        
    
    student s1=new student("vedantika",20);
    student s2=new student(s1);
    s1.display();
    s2.display();
    }
}


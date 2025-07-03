import java.util.*;
import java.util.Scanner;

public abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length, width;
    Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double Area = length * width;
        System.out.println("Area of Rectangle: " + Area);  
    }
}

public class ShapeJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        circle.calculateArea();

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Width: ");
        int width = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();

        sc.close();
    }
}


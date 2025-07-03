import java.util.*;
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

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.print("Area of Rectangle: " + area);
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Circle C = new Circle(15);
        C.calculateArea();
        
        Rectangle R = new Rectangle(10,12);
        R.calculateArea();
    }
}


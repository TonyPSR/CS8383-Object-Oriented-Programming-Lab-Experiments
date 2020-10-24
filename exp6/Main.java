import java.util.Scanner;

abstract class Shape{
    float a;
    float b;
    abstract void printArea();
}

class Rectangle extends Shape{
    public Rectangle(float a, float b){
        this.a = a;
        this.b = b;
    }

    void printArea() {
        float area = a * b;
        System.out.println("The area of the Rectangle is " + area);
    }
}

class Circle extends Shape {
    public Circle(float a){
        this.a = a;
    }

    void printArea() {
        float area = 3.14f*a*a;
        System.out.println("The area of the Circle is " + area);
    }
}

class Triangle extends Shape{

    public Triangle(float a, float b){
        this.a = a;
        this.b = b;
    }

    void printArea() {
        float area = 0.5f*a*b;
        System.out.println("The area of the Triangle is " + area);
    }

}


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n\t\tArea Calculator");
            System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
            System.out.println("Enter your choice: ");
            int choice  = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Length in mm: ");
                    float l = sc.nextFloat();
                    System.out.println("Enter the Width in mm:");
                    float w = sc.nextFloat();
                    Shape rectangle = new Rectangle(l, w);
                    rectangle.printArea();
                    break;
                case 2:
                    System.out.println("Enter the Base in mm: ");
                    float b = sc.nextFloat();
                    System.out.println("Enter the Height in mm:");
                    float h = sc.nextFloat();
                    Shape triangle = new Triangle(b, h);
                    triangle.printArea();
                    break;
                case 3:
                    System.out.println("Enter the Radius in mm: ");
                    float r = sc.nextFloat();
                    Shape circle = new Circle(r);
                    circle.printArea();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!!!");
            }

        }
    }
}

package module1;
import java.util.Scanner;
class Circle
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    void display()
    {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}
public class CircleDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.display();
    }
}
import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width; 

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
    	    Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the length");
           int length=sc.nextInt();
            System.out.println("Enter the breadth");
            int breadth=sc.nextInt();
    
        Rectangle rectangle = new Rectangle(length, breadth);
        
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}


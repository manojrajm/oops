class Shape {
    int numSides;  
    int area;

    Shape(int numSides, int area) {
        this.numSides = numSides;
        this.area = area;
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int numSides, int area, int length, int width) {
        super(numSides, area); 
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        this.area = length * width;
    }

    public void display() {
        System.out.println("Number of Sides: " + numSides);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}

public class P3 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4, 0, 5, 3); 
        rec.calculateArea();
        rec.display();
    }
}


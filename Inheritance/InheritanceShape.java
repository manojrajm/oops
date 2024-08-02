//Create a class called "Shape" with properties such as "numSides" and "area". Create a subclass called "Rectangle" that inherits from the Shape class and adds properties such as "length" and "width".
class Shape
{
	int numsSides;
	int area;
	Shape(int numsSides,int area)
	{
		this.area=area;
		this.numSides=numSides;
	}
}
class Rectangle extends Shape
{
	int length;
	int width;
	Rectangle(int numsSides,int area,int length,int width)
	{
		super(area,numSides);
		this.length=length;
		this.width=width;
	}
}
public class InheritanceShape
{
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle(4,);
	}
}

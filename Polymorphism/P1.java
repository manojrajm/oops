class Shape{
	void display(){
		System.out.println("Drawing the shape");
	}
}
class Rectangle extends Shape{
	void display(){
		System.out.println("Drawing the Rectangle Shape");
	}
}
class Circle extends Shape{
	void display(){
		System.out.println("Drawing the  Circle shape");
	}
}

class Print{
	public void print(Shape s){
	s.display();
	}
}




public class P1{
	public static void main(String []args){
	Shape s = new Shape();
	Rectangle r = new Rectangle();
	Circle c = new Circle();
	Print p = new Print();
	//s.display();
	//r.display();
	//c.display();
	p.print(s);
	p.print(r);
	p.print(c);
	
	}
}

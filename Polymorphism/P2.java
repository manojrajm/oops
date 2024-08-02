class Animal{
	void display(){
		System.out.println("The animal says roar");
	}
}
class Dog extends Animal{
	void display(){
		System.out.println("The Dog says woaf");
	}
}
class Cat extends Animal{
	void display(){
		System.out.println("The Cat says meow");
	}
}

class Speak{
	public void Sounds(Animal A){
		A.display();
	}
}




public class P2{
	public static void main (String[]args){
	Animal A=new Animal();
	Dog d = new Dog();
	Cat c = new Cat();
	Speak speak = new Speak(); 
	speak.Sounds(A);
	speak.Sounds(d);
	speak.Sounds(c);
	
	
	
	}
}

class Vehicle
{
	String make;
	String model;
	int year;
	Vehicle(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void printVehicle()
	{
		System.out.println("\n\tVEHICLE");
		System.out.println("Make	:"+make);
		System.out.println("Model	:"+model);
		System.out.println("Year	:"+year);
	}
}
class Car extends Vehicle
{
	int numDoors;
	String color;
	Car(String make,String model,int year,int numDoors,String color)
	{
		super(make,model,year);
		this.numDoors=numDoors;
		this.color=color;
	}
	public void printCar()
	{
		System.out.println("\n\tCAR");
		System.out.println("make	:"+make);
		System.out.println("Model	:"+model);
		System.out.println("Year	:"+year);
		System.out.println("Doors	:"+numDoors);
		System.out.println("Color	:"+color);
	}
}
public class P2{
	public static void main(String[]args){	
		Vehicle vehicle=new Vehicle("BMW","v1",1999);
		vehicle.printVehicle();
		Car car=new Car("YUNOVA","BRISE",2000,4,"WHITE");
		car.printCar();
	}
	
}

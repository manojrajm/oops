//Create a class called "Person" with properties such as "name", "age", and "address". Create a subclass called "Student" that inherits from the Person class and adds properties such as "grade" and "school".
class Person
{
	String name;
	int age;
	String address;
	Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void printPerson()
	{
		System.out.println("\n\tPERSON");
		System.out.println("Name	:"+name);
		System.out.println("Age	:"+age);
		System.out.println("Address	:"+address);
	}
}
class Student extends Person
{
	String grade;
	String school;
	Student(String name,int age,String address,String grade,String school)
	{
		super(name,age,address);
		this.grade=grade;
		this.school=school;
	}
	public void printStudent()
	{	
		System.out.println("\n\tSTUDENT");
		System.out.println("Name	:"+name);
		System.out.println("Age	:"+age);
		System.out.println("Address	:"+address);
		System.out.println("Grade	:"+grade);
		System.out.println("School	:"+school);
	}
	
}
public class P4
{
	public static void main(String[] args)
	{
		Person person=new Person("AKASH",17,"12,east car street");
		person.printPerson();
		Student student=new Student("HARISH",18,"23,north sreeet","b+","GOVT SCHOOL");
		student.printStudent();
		
	}
}

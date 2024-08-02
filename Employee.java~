import java.util.Date;

public class Employee {

    private String name;    
    private double salary;     
    private Date hireDate;  

    public Employee(String name, double salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this; 
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        if (salary >= 0) { 
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
        return this; 
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Employee setHireDate(Date hireDate) {
        this.hireDate = hireDate;
        return this; 
    }

    public void displayEmployeeDetails() {
        System.out.printf("Name: %s%nSalary: %.2f%nHire Date: %s%n", 
                          name, salary, hireDate);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.00, new Date());

        employee.displayEmployeeDetails();

        employee.setName("Jane Smith")
                .setSalary(60000.00)
                .setHireDate(new Date());

        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();
    }
}


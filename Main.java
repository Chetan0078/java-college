// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display info
    abstract void displayInfo();
}

// Employee class that extends Person
class Employee extends Person {
    protected String company;
    protected double salary;

    // Constructor
    public Employee(String name, int age, String company, double salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }

    // Method to display information
    @Override
    void displayInfo() {
        System.out.println("Employee: " + name + ", Age: " + age + ", Company: " + company + ", Salary: " + salary);
    }

    // Method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to set salary with bonus
    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }
}

// Manager class that extends Employee
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, String company, double salary, String department) {
        super(name, age, company, salary);
        this.department = department;
    }

    // Method to display information
    @Override
    void displayInfo() {
        System.out.println("Manager: " + name + ", Age: " + age + ", Company: " + company + ", Salary: " + salary + ", Department: " + department);
    }
}

// Final class CEO that extends Employee
final class CEO extends Employee {
    private String companyCar;

    // Constructor
    public CEO(String name, int age, String company, double salary, String companyCar) {
        super(name, age, company, salary);
        this.companyCar = companyCar;
    }

    // Method to display information
    @Override
    void displayInfo() {
        System.out.println("CEO: " + name + ", Age: " + age + ", Company: " + company + ", Salary: " + salary + ", Company Car: " + companyCar);
    }
}

// Main class to demonstrate the functionality (this contains the main method)
public class Main {
    public static void main(String[] args) {
        // Creating Employee instance
        Employee emp = new Employee("John", 30, "TechCorp", 50000);
        emp.displayInfo();

        // Applying salary with bonus
        emp.setSalary(50000, 5000);
        emp.displayInfo();

        // Creating Manager instance
        Manager mgr = new Manager("Sarah", 40, "TechCorp", 80000, "Engineering");
        mgr.displayInfo();

        // Creating CEO instance
        CEO ceo = new CEO("Michael", 50, "TechCorp", 200000, "Tesla Model X");
        ceo.displayInfo();
    }
}


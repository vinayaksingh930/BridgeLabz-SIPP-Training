abstract class Employee{
	private int employeeId;
	private String name;
	private Double baseSalary;

	public Employee(int employeeId, String name, Double baseSalary){
	this.employeeId=employeeId;
	this.name=name;
	this.baseSalary=baseSalary;
	}

	public abstract double calculateSalary();

	void displayDetails(){
	System.out.println("ID:" + employeeId + "Name" + name+ "Base Salary" +baseSalary);
	}
	public double getSalary(){ return baseSalary;}
}

class FullTimeEmployee extends Employee{

	private double fixedSalary;

	public FullTimeEmployee( int id, String name , Double baseSalary , int fixedSalary){
	super(id , name , baseSalary);
	this.fixedSalary=fixedSalary;
	}

	public double calculateSalary(){
		return getSalary() + fixedSalary;
	}
}

class PartTimeEmployee extends Employee{
	private int hours;
        private double rate;
	
	public PartTimeEmployee( int id, String name , double salary , int hours , double rate){
		super(id,name,salary);
        this.hours=hours;
		this.rate=rate;
	}

	public double calculateSalary(){
		return getSalary() + (hours*rate);
	}
}

public class Salary{
	public static void main(String args[]){
	Employee e1=new FullTimeEmployee(1,"Vinayak", 10000.0, 1100);
	Employee e2=new PartTimeEmployee(2,"Prachi", 1000, 10 , 1100);

	e1.displayDetails();
	System.out.println("Salary of Employee 1" + e1.calculateSalary());

	e2.displayDetails();
	System.out.println("Salary of Employee 2" + e2.calculateSalary());
	}
}

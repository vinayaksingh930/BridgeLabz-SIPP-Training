class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}

class Intern extends Employee {
    Intern(String name, int id, double salary) {
        super(name, id, salary);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Prachi", 101, 80000, 5);
        Employee emp2 = new Developer(" Vinayak", 102, 60000, "Java");
        Employee emp3 = new Intern("Charlie", 103, 20000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
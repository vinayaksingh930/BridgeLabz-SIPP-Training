class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
}

class Staff extends Person {
    Staff(String name, int age) {
        super(name, age);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Prachi", 16, 10);
        Staff staff = new Staff("Mrs. Johnson", 35);

        System.out.println("Teacher: " + teacher.name + ", Age: " + teacher.age + ", Subject: " + teacher.subject);
        System.out.println("Student: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade);
        System.out.println("Staff: " + staff.name + ", Age: " + staff.age);
    }
}
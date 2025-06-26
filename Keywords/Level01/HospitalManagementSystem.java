class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Alice", 30, "Fever");
        Patient patient2 = new Patient(102, "Bob", 40, "Cold");

        patient1.displayDetails();
        patient2.displayDetails();

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
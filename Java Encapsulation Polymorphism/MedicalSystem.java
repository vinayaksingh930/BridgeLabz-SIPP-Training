abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }


    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharge;

    public InPatient(int patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() {
        return roomCharge + 500; // Base charge
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}


public class MedicalSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Prachi", 30, 1000);
        Patient p2 = new OutPatient(2, " Vinayak", 25, 200);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}
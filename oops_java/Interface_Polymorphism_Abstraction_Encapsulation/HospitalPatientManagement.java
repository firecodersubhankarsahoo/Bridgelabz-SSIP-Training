import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return 800;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient p1 = new InPatient("P001", "Amit", 45);
        p1.addRecord("Surgery Completed");
        patients.add(p1);
        patients.add(new OutPatient("P002", "Riya", 30));

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Medical Records: " + ((MedicalRecord) p).viewRecords());
            }
            System.out.println();
        }
    }
}

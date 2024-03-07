class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
    private String condition;

    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Condition: " + condition);
    }
}

class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Hospital {
    private Doctor doctor;
    private Patient patient;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Details:");
        if (doctor != null) {
            System.out.println("Doctor Details:");
            doctor.displayDetails();
        }

        if (patient != null) {
            System.out.println("Patient Details:");
            patient.displayDetails();
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. John Amery Kinuthia", 50, "Cardiologist");
        Patient patient = new Patient("Jaquiouinous Micheal Musili ", 25, "Chest Pain");

        Hospital hospital = new Hospital();
        hospital.setDoctor(doctor);
        hospital.setPatient(patient);

        hospital.displayHospitalDetails();
    }
}

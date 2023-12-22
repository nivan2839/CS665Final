public class PatientManagement {
        public static void main(String[] args) {
            Doctor doctor1 = new Doctor("Dr. Smith");
            Doctor doctor2 = new Doctor("Dr. Johnson");
    
            doctor1.seePatient("P001", "Alice");
            doctor2.seePatient("P001", "Alice"); // This will use the same patient object as created by doctor1
            doctor1.seePatient("P002", "Bob");
        }
    }

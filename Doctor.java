public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void seePatient(String patientId, String patientName) {
        Patient patient = PatientSystem.getPatient(patientId, patientName);
        System.out.println("Doctor " + name + " is seeing patient " + patient.getName());
    }
}
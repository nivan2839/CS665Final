import java.util.HashMap;
import java.util.Map;

public class PatientSystem {
    private static final Map<String, Patient> patients = new HashMap<>();

    public static Patient getPatient(String id, String name) {
        Patient patient = patients.get(id);

        if (patient == null) {
            patient = new Patient(id, name);
            patients.put(id, patient);
        }

        return patient;
    }
}
package repositories;

import domain.Patient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatientRepository {
    private final Set<Patient> patients = new HashSet<>();
    private final Map<Integer, Patient> patientsMap = new HashMap<>();


}

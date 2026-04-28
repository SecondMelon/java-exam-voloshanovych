package repositories;

import domain.Doctor;
import domain.Specialty;
import exceptions.DoctorPresentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class DoctorRepository {
    private final Logger log = LoggerFactory.getLogger(DoctorRepository.class);

    private final Set<Doctor> doctors = new HashSet<>();
    private final Map<Integer, Doctor> doctorsMap = new HashMap<>();

    public DoctorRepository() {}

    public void add(Doctor doctor) throws DoctorPresentException {
        try {
            if (doctors.contains(doctor)) throw new DoctorPresentException("This doctor is already in the list");
            doctors.add(doctor);
            doctorsMap.put(doctor.getId(), doctor);
        } catch (DoctorPresentException e) {
            log.warn("The doctor {} is already presented", doctor.getName(), e);
            throw e;
        }
    }

    public void remove(int id) {
        doctors.remove(doctorsMap.get(id));
        doctorsMap.remove(id);
    }

    public void move(Doctor doctor, Specialty specialty) {
        doctor.setSpecialty(specialty);
    }
}

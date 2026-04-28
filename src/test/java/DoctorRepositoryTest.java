import domain.Doctor;
import domain.Specialty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.DoctorRepository;

public class DoctorRepositoryTest {

    private DoctorRepository doctorRepository = new DoctorRepository();

    @BeforeEach
    void setUp() {
        this.doctorRepository = new DoctorRepository();
        doctorRepository.add(new Doctor(1, "Іван Іванович", Specialty.GASTROENTEROLOGIST));
        doctorRepository.add(new Doctor(2, "Ванентина Кіт", Specialty.DERMATOLOGIST));
    }

    @Test
    void addDoctorShouldThrow() {
        // Assertions does not work
    }
}

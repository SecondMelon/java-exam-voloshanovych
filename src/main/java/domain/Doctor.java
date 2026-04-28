package domain;

import lombok.Data;
import lombok.Setter;

@Data
public class Doctor {
    final int id;
    final String name;
    Specialty specialty;
}
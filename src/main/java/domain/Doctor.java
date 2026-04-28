package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Doctor {
    final int id;
    final String name;
    @Setter
    Specialty specialty;
}
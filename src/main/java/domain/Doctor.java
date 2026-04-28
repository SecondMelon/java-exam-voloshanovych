package domain;

import lombok.Value;

@Value
public class Doctor {
    String name;
    Specialty specialty;
}
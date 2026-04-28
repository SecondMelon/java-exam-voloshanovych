package domain;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Appointment {
    Patient patient;
    LocalDateTime timeOfVisit;
}

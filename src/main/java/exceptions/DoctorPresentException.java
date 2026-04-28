package exceptions;

public class DoctorPresentException extends AppException {
    public DoctorPresentException(String message, Throwable cause) { super(message, cause); }
    public DoctorPresentException(String message) { super(message); }
}

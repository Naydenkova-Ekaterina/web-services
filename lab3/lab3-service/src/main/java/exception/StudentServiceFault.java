package exception;

public class StudentServiceFault {

    private static final String DEFAULT_MESSAGE = "parameter cannot be null or empty";
    protected String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public static StudentServiceFault defaultInstance() {
        StudentServiceFault fault = new StudentServiceFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }

}

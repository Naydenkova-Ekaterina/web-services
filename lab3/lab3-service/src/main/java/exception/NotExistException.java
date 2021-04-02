package exception;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "exception.StudentServiceFault")
public class NotExistException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    private final StudentServiceFault fault;

    public NotExistException(String message, StudentServiceFault fault) {
        super(message);
        this.fault = fault;
    }

    public NotExistException(String message, StudentServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public StudentServiceFault getFaultInfo() {
        return fault;
    }

}

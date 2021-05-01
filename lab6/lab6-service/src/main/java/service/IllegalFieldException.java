package service;

public class IllegalFieldException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    public static IllegalFieldException DEFAULT_INSTANCE = new
            IllegalFieldException("Parameter cannot be null or empty.");
    public IllegalFieldException(String message) {
        super(message);
    }
}

package service;

public class NotExistException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    public static NotExistException DEFAULT_INSTANCE = new
            NotExistException("Entity doesn't exist.");
    public NotExistException(String message) {
        super(message);
    }

}

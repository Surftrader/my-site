package ua.com.poseal.mysite.exception;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}

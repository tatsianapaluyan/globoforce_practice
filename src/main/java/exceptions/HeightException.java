package exceptions;

public class HeightException extends Exception {

    private String errorCode = "Unknown_Exception has been thrown ";

    public HeightException() {
    }


    public String getErrorCode() {
        return errorCode;
    }
}

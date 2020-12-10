package by.epam.geometry.exception;

public class InvalidPointDataException extends Exception {

    public InvalidPointDataException(String message) {
        super(message);
    }

    public InvalidPointDataException(){
        super();
    }

    @Override
    public String getMessage() {
        return "Invalid data about Point class";
    }
}

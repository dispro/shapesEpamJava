package by.epam.geometry.exception;

public class InvalidConeDataException extends Exception{

    public InvalidConeDataException() {
        super();
    }

    public InvalidConeDataException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Invalid data about Cone class";
    }
}

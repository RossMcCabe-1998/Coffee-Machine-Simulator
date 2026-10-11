package exceptions;

/**
 * Custom exception thrown for invalid menu choice is selected.
 * @author Ross.
 */
public class InvalidCoffeeException extends Exception{

    public InvalidCoffeeException(String message){
        super(message);
    }
}

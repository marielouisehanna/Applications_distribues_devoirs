
public class NoCashAvailableException extends Exception {
    public NoCashAvailableException() {
        super("No cash available in the account");
    }
}
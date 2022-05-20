public class EmptyStringException extends RuntimeException {
    
    @Override
    public String getMessage() {
        return "A String não deve ser vazia.";
    }
}

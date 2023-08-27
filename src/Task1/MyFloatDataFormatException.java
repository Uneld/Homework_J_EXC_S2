package Task1;

public class MyFloatDataFormatException extends Exception{
    private final String arg;

    public MyFloatDataFormatException(String message, String string) {
        super(message);
        this.arg = string;
    }

    public String getArg() {
        return arg;
    }
}

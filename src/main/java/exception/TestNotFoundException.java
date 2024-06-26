package exception;

public class TestNotFoundException extends Throwable {
    private String message;

    public TestNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TestNotFoundException: " + message;
    }
}
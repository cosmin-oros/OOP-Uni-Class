package Extra;

public class CustomException {

    public static void main(String[] args) {

        try {
            // Call a method that might throw a custom exception
            doSomething();
        } catch (CstmException ex) {
            // Handle the custom exception
            System.out.println("Caught a custom exception: " + ex.getMessage());
        }
    }

    public static void doSomething() throws CstmException {
        // Simulate a scenario where a custom exception may be thrown
        boolean condition = true;
        if (condition) {
            throw new CstmException("This is a custom exception");
        }
    }

    public static class CstmException extends Exception {
        public CstmException(String message) {
            super(message);
        }
    }
}

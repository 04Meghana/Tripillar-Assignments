package module5;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class ExceptionClass {

    public static void main(String[] args) {

        try {
            throw new MyException("Custom Exception Occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


package lesson6.generate_exception;

public class SiarheiNameException extends Exception{
    @Override
    public String getMessage() { return "Don't input Siarhei value!!!";}
}

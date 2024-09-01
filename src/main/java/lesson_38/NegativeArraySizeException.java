package lesson_38;

public class NegativeArraySizeException extends Exception {
    //генирируем конструктор, принимающий на вход поясняющий message
    public NegativeArraySizeException(String message) {
        super(message);
    }
}

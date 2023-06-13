package dz4;

public class MyArraySizeException extends MyArrayException{

    public MyArraySizeException(String message, String[][] arr) {
        super(message, arr);
    }
}

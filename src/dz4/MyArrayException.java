package dz4;

public class MyArrayException extends Exception{
    private String[][] arr;

    public String[][] getArr() {
        return arr;
    }

    public MyArrayException(String message, String[][] arr) {
        super(message);
        this.arr = arr;
    }
}

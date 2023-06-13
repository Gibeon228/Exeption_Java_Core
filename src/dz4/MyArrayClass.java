package dz4;

public class MyArrayClass {
    private String[][] arr;

    /**
     *
     * @param arr
     * @throws MyArraySizeException
     */
    public MyArrayClass(String[][] arr) throws MyArraySizeException{
        if (arr[0].length != 4 || arr.length != 4) {
            throw new MyArraySizeException("Массив данной размерности нас не интересует", arr);
        }
        this.arr = arr;
        System.out.println("То, что нам нужно");
    }



    public int sumSymbolArray() throws MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < this.arr[0].length; i++) {
            for (int j = 0; j < this.arr.length; j++) {
                if (!this.arr[i][j].matches("[0-9]+")) {
                    throw new MyArrayDataException("Данные введены некорректно: в массиве содержатся символы, отличне от цифр", arr);
                }
                sum += Integer.parseInt(this.arr[i][j]);
            }

        }
        return sum;
    }

    public String[][] getArr() {
        return arr;
    }
}

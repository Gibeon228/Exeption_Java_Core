import dz4.MyArrayClass;
import dz4.MyArrayDataException;
import dz4.MyArraySizeException;

public class Main {
    public static void main(String[] args) {

        String[][] arr01 = new String[4][4];
        String[][] arr02 = new String[2][4];
        String[][] arr03 = new String[4][4];




        arr01[0][0] = "10";
        arr01[0][1] = "10";
        arr01[0][2] = "10";
        arr01[0][3] = "10";

        arr01[1][0] = "100";
        arr01[1][1] = "100";
        arr01[1][2] = "100";
        arr01[1][3] = "100";

        arr01[2][0] = "1000";
        arr01[2][1] = "1000";
        arr01[2][2] = "1000";
        arr01[2][3] = "1000";

        arr01[3][0] = "10000";
        arr01[3][1] = "10000";
        arr01[3][2] = "10000";
        arr01[3][3] = "10000";

        arr03[0][0] = "10";
        arr03[0][1] = "10";
        arr03[0][2] = "10";
        arr03[0][3] = "10";

        arr03[1][0] = "100";
        arr03[1][1] = "1w00";
        arr03[1][2] = "1e00";
        arr03[1][3] = "100";

        arr03[2][0] = "1000";
        arr03[2][1] = "1000";
        arr03[2][2] = "1000";
        arr03[2][3] = "100ve0";

        arr03[3][0] = "10000";
        arr03[3][1] = "10000";
        arr03[3][2] = "10000";
        arr03[3][3] = "10000";
        try {
            MyArrayClass myArr01 = new MyArrayClass(arr01);

            System.out.println(myArr01.sumSymbolArray());
        }
        catch (MyArraySizeException ex) {
            System.out.printf("Нужен массив размерностью 4х4, %s\n", ex.getMessage());
        }
        catch (MyArrayDataException ex) {
            System.out.printf("Нужен массив c цифрами, %s\n", ex.getMessage());
        }

        try {
            MyArrayClass myArr02 = new MyArrayClass(arr02);
        }
        catch (MyArraySizeException ex) {
            System.out.printf("Нужен массив размерностью 4х4, %s\n", ex.getMessage());
        }


        try {
            MyArrayClass myArr03 = new MyArrayClass(arr03);
            System.out.println(myArr03.sumSymbolArray());
        }
        catch (MyArraySizeException ex) {
            System.out.printf("Нужен массив размерностью 4х4, %s\n", ex.getMessage());
        }
        catch (MyArrayDataException ex) {
            System.out.printf("Нужен массив c цифрами, %s\n", ex.getMessage());
        }
    }
}
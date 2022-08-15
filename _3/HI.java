package task.wp._3;
//К квадрату (корень) или не к квадрату (корень)
import java.util.Arrays;

public class HI {

    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 9, 16, 7, 25};
        int[] as = squareOrSquareRoot(a);
        System.out.println(Arrays.toString(as));
        System.out.println(Math.sqrt(16));
    }
}

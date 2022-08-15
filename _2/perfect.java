package task.wp._2;

import java.util.Arrays;

public class perfect {
    public static int[] humanYearsCatYearsDogYears(final int y) {
        return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
    }
    public static void main(String[] args) {
        int[] printYears = humanYearsCatYearsDogYears(8);
        System.out.println(Arrays.toString(printYears));
    }
}

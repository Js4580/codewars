package task.wp._2;
//Кошачьи годы, Собачьи годы
import java.util.Arrays;

public class gf {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;
        int [] publicYears = new int [3];
        if(humanYears > 0){
            for (int outerCount = 2; outerCount < publicYears.length; outerCount++){
                catYears += 15;
                dogYears += 15;
                if (humanYears > 1){
                    for (int middleCont = 2; middleCont < publicYears.length; middleCont++) {
                        catYears += 9;
                        dogYears += 9;
                        if (humanYears > 2){
                            for (int innerCount = 0; innerCount < humanYears -2; innerCount++) {
                                catYears += 4;
                                dogYears += 5;
                            }
                            return new int[]{humanYears, catYears, dogYears};
                        }
                    }
                    return new int[]{humanYears, catYears, dogYears};
                }
            }
            return new int[] {humanYears, catYears, dogYears};
        }else
            return new int []{0, 0, 0};
    }

    public static void main(String[] args) {
        int[] printYears = humanYearsCatYearsDogYears(15);
        System.out.println(Arrays.toString(printYears));
    }
}

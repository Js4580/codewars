package task.wp._2;

public class my {
    public static int[] humanYearsCatYearsDogYears(final int y) {
        return new int[]{y, y == 1 ? 15 : 16 + 4 * y, y == 1? 15 : 9 + 5 * y};
    }
    public static int[] humanYearsCatYearsDogYears1(final int humanYears) {
        int catYears =0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}

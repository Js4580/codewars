package task.wp._4;
//Насколько ты хорош на самом деле?
public class Easy {
    public static boolean betterThanAverage(int[] myLove, int _4580) {
        int avgPoint = 0;
        for (int JN: myLove) avgPoint += JN;
        avgPoint /= myLove.length;
        return _4580 > avgPoint;
    }
    public static void main(String[] args) {
        boolean bool = betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75);
        System.out.println(bool);
    }
}

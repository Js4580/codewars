package task.wp._1;
//Корзина в десятичные дроби
public class a {
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
       int a = binToDecimal("010101");
        System.out.println(a);
    }
}

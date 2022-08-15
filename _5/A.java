package task.wp._5;
//Преобразовать число в обратный массив цифр
public class A {
    public static void main(String[] args) {
        String str = "Football";
        char[] reverseStr = str.toCharArray();
        for (int index = reverseStr.length -1; index >= 0 ; index--) System.out.print(reverseStr[index]);
    }

}

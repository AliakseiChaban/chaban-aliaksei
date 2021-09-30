package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello NEW World!" );
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a, b;
        a = 5;
        b = -25;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {

        int value = 200000;

        if (value <= 0) {
            System.out.println("Red");
        }
        if (0<value && value<= 100 ){
            System.out.println("Yellow");
        }
        if (value>100){
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {

        int a=123, b=144;

        if (a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}

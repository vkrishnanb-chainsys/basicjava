package edu.lessons.day32.flowControl;

/**
 * Sorts three int-values, given as local variables a, b, and c.
 * The program uses three if-statements to decide whether the
 * values have to be exchanged or not.
 * 
 * @author 
 */
public class SortThreeNumbers {

    /**
     * Sorts the numbers of thre variables by comparing
     * and exchanging.
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 2;
        int t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("sorting...");

        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        if (a > c) {
            t = c;
            c = a;
            a = t;
        }
        if (b > c) {
            t = c;
            c = b;
            b = t;
        }
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}

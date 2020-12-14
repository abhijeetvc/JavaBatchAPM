// Variables: Storage area in memory.
// Types of variables:
// a) instance variables, b) local variables, c) static/class variables,
// d) parameters

import java.util.Scanner;

public class HelloJava {

    int x=10;    // instance variable
    static int a=25;
    int p=30;

    public static void main(String[] args) {
        int y=20;  // local variable
        System.out.println("Hello Java");
        HelloJava h=new HelloJava();
        System.out.println("value of y: "+y);
        System.out.println("Value of x: "+h.x);
        System.out.println("Value of a: "+a);
        System.out.println("Value of p: "+h.p);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a1: ");
        int a1=sc.nextInt();

        System.out.println("Enter value for b1: ");
        int b1=sc.nextInt();
        int total=a1+b1;
        System.out.println("Addition is: "+total);
    }
}

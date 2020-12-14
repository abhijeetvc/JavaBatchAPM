// Constructor: Special type of method
// -> It do not need explicit call like method
// -> Gets called as soon as the object is created
// -> It has name same as class name
// -> Used for initialization
// -> Do not have the return type

import java.util.Scanner;

public class ConstructorPrg {

    int a;
    int b;

    public ConstructorPrg(int a,int b){
        this.a=a;   // this keyword -> used to refer to current object
        this.b=b;
    }

    void add(){
        int result=a+b;
        System.out.println("Add: "+result);
    }

    void sub(){
        int result=a-b;
        System.out.println("Sub: "+result);
    }

    void mul(){
        int result=a*b;
        System.out.println("Mul: "+result);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();

        ConstructorPrg c=new ConstructorPrg(a,b);
        c.add();
        c.sub();
        c.mul();
    }
}

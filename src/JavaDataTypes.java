// DataTypes: a) Primitive and b) Non-primitive
// a) Primitive: int, char, float, double, long, short, byte, boolean
// b) Non-primitive: array, string, interface, class

public class JavaDataTypes {

    public static void main(String[] args) {
        int a=10;   // default=0
        System.out.println("Max value of int: "+Integer.MAX_VALUE);
        System.out.println("Min value of int: "+Integer.MIN_VALUE);
        float b=10.5f;  // 0.0
        System.out.println("Float range: "+Float.MIN_VALUE+ " to "+Float.MAX_VALUE);

        System.out.println("Double range: "+Double.MIN_VALUE+ " to "+Double.MAX_VALUE);

        byte b1=127;  //0
        System.out.println("Byte range: "+Byte.MIN_VALUE+ " to "+Byte.MAX_VALUE);

        short s=32178;   //0
        System.out.println("Short range: "+Short.MIN_VALUE+ " to "+Short.MAX_VALUE);

        boolean flag=true;  //false

        char ch = 'A';  //0
        System.out.println("char default: "+ch);

    }
}

// a) Get the input(marks) from scanner and categorize the student based on marks
// b) Find Factorial of given number
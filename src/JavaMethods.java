// Method: It is a block of code
// Method has: body, return type, access modifier, name, return statement, parameters



public class JavaMethods {

    void display(){
        System.out.println("In display method");
    }

    void display1(){
        System.out.println("In display1 method");
    }

    int getData(int x,int y){
//        int x=10;
//        int y=20;
        int result=x+y;
        return result;
    }

    void getData1(){
        int value=getData(20,30);
        System.out.println("Result is: "+value);
    }

    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        jm.display();
        jm.display1();
//        int total=jm.getData();
//        System.out.println(total);
        jm.getData1();
    }
}

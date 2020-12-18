// Polymorphism: same name having multiple forms
// a) Runtime Polymorphism (Method Overriding), b) Compile Time polymorphism (Method Overloading)

public class Birds {

    void fly(){
        System.out.println("All birds fly");
    }

    void eat(){
        System.out.println("Birds eat insects");
    }
}

class Eagle extends Birds{

    void fly(){
        super.fly();
        System.out.println("Eagle flies very high");
    }

    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
    }
}

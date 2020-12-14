// Abstract class: Abstract class is an incomplete class.

public abstract class Animal1 {
    abstract void eat();

//    void run(){
//        System.out.println("All animals run");
//    }

}

class Elephant1 extends Animal1{

    @Override
    void eat() {
        System.out.println("Elephants eat grass");
    }

    public static void main(String[] args) {
        Elephant1 e=new Elephant1();
        e.eat();

    }
}

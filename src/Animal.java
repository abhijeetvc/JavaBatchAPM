// Inheritance: One class is defined from another class.
// Inheritance is also called as 'is-a' relationship
// types: a) Single, b) Multilevel, c) Multiple, d) Hierarchical, e) Hybrid

public class Animal {

    public void run(){
        System.out.println("Animals run");
    }

    public void eat(){
        System.out.println("Animals eat");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("Dogs bark");
    }
//
//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.eat();
//        d.run();
//        d.bark();
//    }
}

class Puppy extends Dog{

    public void bark1(){
        System.out.println("Puppy also barks loudly");
    }

//    public static void main(String[] args) {
//        Puppy p=new Puppy();
//        p.eat();
//        p.run();
//        p.bark();
//        p.bark1();
//
//    }
}

class Elephant extends Animal{

    void size(){
        System.out.println("Elephants are bigger in size");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.bark1();
        p.bark();
        Elephant e=new Elephant();
        e.run();
        e.eat();
        e.size();
    }
}

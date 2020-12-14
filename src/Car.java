public class Car {

    public void run(){
        System.out.println("All cars run on petrol and diesel");
    }
}

class Audi extends Car{

    Engine engine;

    public Audi(Engine engine){
        this.engine=engine;
    }

    public void features(){
        engine.capacity();
        System.out.println("Audi has many features");
    }

    public static void main(String[] args) {
        Engine e=new Engine();
        Audi a=new Audi(e);
        a.features();
    }
}

class Engine{

    public void capacity(){
        System.out.println("Engines are of differenct capacity");
    }
}
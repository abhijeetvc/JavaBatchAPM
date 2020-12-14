public interface Rbi {

    void withDraw();
    void deposit();

}

class Sbi implements Rbi{

    @Override
    public void withDraw() {
        System.out.println("In withdraw method of sbi");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit method of sbi");
    }

    void displaySbi(){
        System.out.println("In display of sbi");
    }

}

class Icici implements Rbi{

    @Override
    public void withDraw() {
        System.out.println("In withdarw method of icici");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of icici");
    }

    public void displayIcici(){
        System.out.println("In display of icici");
    }
}

class MainCheck {
    public static void main(String[] args) {
      // Sbi s=new Sbi();
        Rbi r1=new Sbi();
        r1.withDraw();
        r1.deposit();

        Rbi r2=new Icici();
        r2.withDraw();
        r2.deposit();

    }
}
// Executor Framework

public class RunnablePrg implements Runnable {

    public static void main(String[] args) {

        RunnablePrg p=new RunnablePrg();
        Thread t=new Thread(p);
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}

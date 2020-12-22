//Multithreading:
// Process: Program under execution
// Thread: Smaller unit of process


// USing threads: a) Using the Thread class, b) Implementing Runnable Interface
public class MultithreadPrg extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Value of i: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MultithreadPrg m=new MultithreadPrg();
        MultithreadPrg m1=new MultithreadPrg();
        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m1.start();
        System.out.println("Hiiiiiiii...");
    }
}

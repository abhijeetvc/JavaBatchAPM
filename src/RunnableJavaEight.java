public class RunnableJavaEight {

    public static void main(String[] args) {

//        Runnable r1=new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++){
//                    System.out.println(i);
//                }
//            }
//        };
        Runnable r1=()->{
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
        };
        Thread t=new Thread(r1);
        t.start();
    }
}

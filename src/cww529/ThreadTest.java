package cww529;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(1000);
//        new Thread(()->{
//            for (int i = 0; i <5 ; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(i);
//            }
//        }).start();
//        Thread.sleep(1000);    //主线程和子线程都等待

//        t.run();//在main线程对Thread t = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    },"第一滴血");象的方法调用，没有启动子线程
                //代码在那个线程中，就让那个线程休眠。start是线程申请调度，线程处于就绪态，
                  // 动作，run线程处于运行态的时候运行一段代码
         new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("第一滴血");   //自己运行哦
            }
        },"第一滴血").start();
        System.out.println("main");
    }
}

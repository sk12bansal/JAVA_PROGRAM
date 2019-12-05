package java_assignment;

import java.time.LocalDateTime;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running.....");
    }
}
public class ThreadNaming {

    public static  void main(String args[]){
        Thread1 t1 = new Thread1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setName("MyThread");

        System.out.println("==========Thread name after changing the "+ "thread name========");
        System.out.println("New Thread name:  " + t1.getName());
        System.out.println("Current time: " + LocalDateTime.now());

        try {
            System.out.println("=========Thread is going sleep for 10 seconds===============");
            Thread.sleep(10000);
            System.out.println("Thread wake up after 10 seconds");
            System.out.println("Current time: " + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

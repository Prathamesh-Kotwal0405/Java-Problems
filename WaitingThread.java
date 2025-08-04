// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.lang.*;
class MyThread extends Thread{
    public void run(){
        System.out.println("The thread is running: "+ Thread.currentThread().getName());
    }
}
class WaitingThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        try{
            thread1.join();
        }catch(Exception e){
            System.out.println("Exception is: " + e.getMessage());
        }
        thread2.start();
    }
}

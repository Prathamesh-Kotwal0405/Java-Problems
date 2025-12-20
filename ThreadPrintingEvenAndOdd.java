// Create two threads, using the Executor framework and try to print odd number with one thread and another thread will print even number one by one.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPrintingEvenAndOdd {

    private static volatile boolean isOddTurn = true;
    public static void main(String[] args) {
        ExecutorService exc = Executors.newFixedThreadPool(2);
        Runnable printOddNumbers = ()  -> {
            for(int i=5;i<=20;i+=2){
                synchronized (ThreadPrintingEvenAndOdd.class){
                    while(!isOddTurn){
                        try {
                            ThreadPrintingEvenAndOdd.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd number: "+ i + " - " + Thread.currentThread().getName());
                    isOddTurn = false;
                    ThreadPrintingEvenAndOdd.class.notify();
                }
            }
        };

        Runnable printEvenNumbers = ()  -> {
            for(int i=6;i<=20;i+=2){
                synchronized (ThreadPrintingEvenAndOdd.class){
                    while(isOddTurn){
                        try {
                            ThreadPrintingEvenAndOdd.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even number: "+ i + " - " + Thread.currentThread().getName());
                    isOddTurn = true;
                    ThreadPrintingEvenAndOdd.class.notify();
                }
            }
        };
        exc.submit(printOddNumbers);
        exc.submit(printEvenNumbers);
        exc.shutdown();
    }
}

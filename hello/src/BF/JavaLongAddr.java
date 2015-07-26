package BF;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by wwh on 15-5-17.
 */
public class JavaLongAddr {
    public static void main(String args[]) throws InterruptedException {
        LongAdder la = new LongAdder();
        class CountThread extends Thread{
            public void run(){
                for(int i = 0; i < 1000000; ++i){
                    la.increment();
                }
            }
        }
        double start = System.currentTimeMillis();
        CountThread ct1 = new CountThread();
        CountThread ct2 = new CountThread();
        CountThread ct3 = new CountThread();
        CountThread ct4 = new CountThread();
        CountThread ct5 = new CountThread();
        CountThread ct6 = new CountThread();
        CountThread ct7 = new CountThread();
        CountThread ct8 = new CountThread();
        CountThread ct9 = new CountThread();
        CountThread ct10 = new CountThread();
        CountThread ct11 = new CountThread();
        CountThread ct12 = new CountThread();
        CountThread ct13 = new CountThread();
        CountThread ct14 = new CountThread();
        CountThread ct15 = new CountThread();
        CountThread ct16 = new CountThread();
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();
        ct6.start();
        ct7.start();
        ct8.start();
        ct9.start();
        ct10.start();
        ct11.start();
        ct12.start();
        ct13.start();
        ct14.start();
        ct15.start();
        ct16.start();
        ct1.join();
        ct2.join();
        ct3.join();
        ct4.join();
        ct5.join();
        ct6.join();
        ct7.join();
        ct8.join();
        ct9.join();
        ct10.join();
        ct11.join();
        ct12.join();
        ct13.join();
        ct14.join();
        ct15.join();
        ct16.join();
        double end = System.currentTimeMillis();
        System.out.println(la);
        System.out.println(end-start);
    }
}

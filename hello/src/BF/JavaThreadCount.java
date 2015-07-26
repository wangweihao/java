package BF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

import static java.lang.System.*;

/**
 * Created by wwh on 15-5-14.
 */

public class JavaThreadCount {
    int b =100;
    public static final int a = 100;
    String s = "asd";
    StringBuffer sb = new StringBuffer("hjahahha");

    public static void main(String args[]) throws InterruptedException, IOException {
        class Counter {
            int i = 0;
            private volatile int count = 0;
            public synchronized void increment() {
                ++count;
            }
            public int getCount() {
                return count;
            }
        }
        final Counter counter = new Counter();
        class CountingThread extends Thread{
            public void run() {
                for(int x = 0; x < 1000000; ++x)
                    counter.increment();
            }
        }
        double start = System.currentTimeMillis();
        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        double end = System.currentTimeMillis();
        out.println(counter.getCount());
        System.out.println(end-start);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String ss = br.readLine();
        out.println(ss);

    }
}

package list;

import java.io.PrintStream;

/*
 * Created by wwh on 15-5-7.
 */
public class List<T> {
    public static void main(String args[]){
        System.out.println("haha");
    }

    /**
     * Created by wwh on 15-5-7.
     */
    public static class Print {
        public static void print(Object obj) {
            System.out.println(obj);
        }
        public static void print(){
            System.out.println();
        }

        public static void printnb(Object obj){
            System.out.print(obj);
        }
        public static PrintStream
        printf(String format, Object... args){
            return System.out.printf(format, args);
        }
    }
}

class A{
    int i;
    public A(int i) {
        this.i = i;
    }
    void print(){
        System.out.println(i);
    }
}


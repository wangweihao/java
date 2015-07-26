/**
 * Created by wwh on 15-5-7.
 */


import BF.T;
import list.List;
import list.List.Print;

public class construct {
    String s;
    int i;
    int j;

    public construct(String s) {
        this.s = new String(s);
        System.out.println("construct 1 called");
    }

    public construct(String s, int i) {
        this(s);
        this.i = i;
    }

    protected void finalize() {
        System.out.println("finalize called");
    }

    void print() {
        System.out.println("---" + i + ',' + j);
    }

    public static void main(String args[]) {
        List<T> a = new List<T>();
        int k = 10;
        construct c = new construct("aaaa");
        construct c2 = new construct("bbbbb", 20);
        c.print();
        System.out.println(k);
        c = null;
        c2 = null;
        System.gc();
        Print.print(100000);
    }

}

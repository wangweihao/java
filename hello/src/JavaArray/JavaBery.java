package JavaArray;

/**
 * Created by wwh on 15-6-7.
 */

class Bery{
    public String toString(){
        return "haha";
    }
}

public class JavaBery {
    void f(Bery[] b){
        for(Bery c : b){
            System.out.println(c);
        }
    }
    Bery[] f2(int[] a){
        System.out.println(a.length);
        Bery[] bb = new Bery[a.length];
        for(int i = 0; i < bb.length; ++i){
            bb[i] = new Bery();
        }
        return bb;
    }
    public static void main(String[] args){
        Bery[] c = new Bery[] {new Bery(), new Bery() };
        JavaBery jb = new JavaBery();
        jb.f(c);
    }
}

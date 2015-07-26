/**
 * Created by wwh on 15-5-8.
 */
public class JavaFinal {
    public static void main(String args[]){
        final Foo f = new Foo(100);
        System.out.println(f.i);
        f.func(200);
    }

}

class Foo {
    int i;
    public Foo(int i) {
        this.i = i;
    }
    public void func(final int i){
        System.out.println(i);
        //i = 300;
    }
}

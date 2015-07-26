/**
 * Created by wwh on 15-5-7.
 */
public class Base {
    int i = 10;
    private int j  = 20;
    protected int k = 30;
    public int p = 40;

    public Base(int i) {
        this.i = i;
    }

    public void func1(){
        System.out.println("i am public func1");
    }
    protected void func2(){
        System.out.println("i am protected func2");
    }
    private void func3(){
        System.out.println("i am private func3");
    }
    public static void main(String args[]){
        Base b = new Base(9);
        b.func1();
        b.func2();
        b.func3();
        System.out.println(b.i);
        System.out.println(b.j);
        System.out.println(b.k);
        System.out.println(b.p);
    }
}

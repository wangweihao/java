/**
 * Created by wwh on 15-5-7.
 */

public class Derived extends Base {
    public Derived(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return "Derived{}";
    }

    protected void func(){
        System.out.println("func");
    }
    public static void main(String args[]){
        Base b = new Base(9);
        b.func1();
        b.func2();
        System.out.println(b.i);
        //System.out.println(b.j);
        System.out.println(b.k);
        System.out.println(b.p);

    }
}

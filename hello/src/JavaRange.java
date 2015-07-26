/**
 * Created by wwh on 15-5-7.
 */

import net.mindview.util.Range;

public class JavaRange {
    @Override
    public String toString() {
        return "JavaRange{}";
    }

    public static void main(String args[]){
        for(int i : Range.range(10, 20)){
            System.out.println(i);
        }

        Base a = new Base(1);
        a.func2();
        a.func1();
        Derived d = new Derived(1);
        d.func1();
        d.func2();
        System.out.println(d.i);
    }
}

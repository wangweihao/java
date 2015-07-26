import BF.JavaInner;

/**
 * Created by wwh on 15-6-1.
 */
public class JavaInnerConstruct extends Outter.Inner {
    JavaInnerConstruct(Outter o){
        //super();
        o.super();
    }
    public static void main(String[] args){
        Outter ot = new Outter();
        JavaInnerConstruct ii = new JavaInnerConstruct(ot);
    }
}

class Outter{
    Outter(){
        System.out.println("Outter");
        Inner i = new Inner();
    }
    class Inner{
        Inner(){
            System.out.println("Inner");
        }
    }
}

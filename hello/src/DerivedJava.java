import list.BaseJava;

/**
 * Created by wwh on 15-5-8.
 */
public class DerivedJava extends BaseJava {
    double f = 0.0;

    public DerivedJava() {
        System.out.println("DerivedJava construct");
    }

    public void MyFunc(){
        System.out.println("i am Dervied class function");
    }
    void func(){
        System.out.println("i am Dervied class func()");
        super.MyFunc();
    }
    public static void main(String args[]){
        DerivedJava d = new DerivedJava();
        d.MyFunc();
        d.func();
    }

}

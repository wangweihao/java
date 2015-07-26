/**
 * Created by wwh on 15-5-7.
 */
public class func {
    void func1(){
        System.out.println("func1 called");
    }
    void func2(){
        System.out.println("func2 called");
        this.func1();
    }
    public static void main(String args[]){
        func f = new func();
        f.func1();
        f.func2();
    }
}

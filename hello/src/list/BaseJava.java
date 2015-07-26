package list;

/**
 * Created by wwh on 15-5-8.
 */
public class BaseJava {
    private int i;
    private String s;

    public BaseJava() {
        System.out.println("BaseJava construct");
    }

    public void MyFunc(){
        System.out.println("i am base class function");
    }
    public static void main(String args[]){
        BaseJava b = new BaseJava();
        b.MyFunc();
    }
}

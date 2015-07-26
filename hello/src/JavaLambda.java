/**
 * Created by wwh on 15-5-11.
 */
import java.lang.Thread;

public class JavaLambda {
    static int i = 0;
    public static void Rthread(){
        ++i;
        new Thread(()->System.out.println("i am lambda thread:" + i)).start();
    }

    public static void main(String args[]){
        Rthread();
        Rthread();
        Rthread();
        Rthread();
    }
}

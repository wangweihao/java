/**
 * Created by wwh on 15-5-7.
 */
public class Fibonacci {
    public static void main(String args[]){
        int i = 5;
        int a = 1, b = 1;
        int t;
        for(i = 0; i < 10; i++){
            System.out.println(a);
            t = b;
            b = a+b;
            a = t;
        }
    }
}

package JavaArray;

/**
 * Created by wwh on 15-6-5.
 */

class A{
    A(){
        System.out.println("A created");
    }
}

public class JavaArrayTry {
    public static void main(String[] args){
        A[] a = new A[10];
        for(int i = 0; i < 10; i++){
            a[i] = new A();
        }
    }
}

/**
 * Created by wwh on 15-5-7.
 */
public class JavaArgs {
    static void f(String... args){
        for(String i : args){
            System.out.println(i);
        }
    }
    public enum K{
        One,
        Two,
        Three
    }
    public static void main(String args[]){
        f("a", "b", "c");
        K a = K.One;
        a = K.Two;
        System.out.println(a);
        a = K.Two;
        switch (a){
            case One:
                System.out.println("One");
                break;
            case Two:
                System.out.println("Two");
                break;
            case Three:
                System.out.println("Three");
                break;
            default:
                System.out.println("default");
        }
    }
}

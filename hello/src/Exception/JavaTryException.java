package Exception;

/**
 * Created by wwh on 15-6-5.
 */

class TryException extends Exception{

}

public class JavaTryException {
    static void func() throws NegativeArraySizeException{
        int[] a = new int[-3];
    }
    static {
        System.out.println("wo cao");
    }

    public static void main(String[] args){
        try{
            func();
        }catch (NegativeArraySizeException e){
            System.out.println("hehe");
        }
    }
}

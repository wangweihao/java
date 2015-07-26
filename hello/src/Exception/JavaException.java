package Exception;

/**
 * Created by wwh on 15-6-2.
 */
public class JavaException{
    public static void main(String[] args){
        try{
            int i = 10;
            int j = 20;
            int k = j/i;
            throw new MyException("error");
        }catch (MyException e){
            e.toString();
            System.out.println(e.str);
        }
    }
}

class MyException extends Exception{
    String str;
    MyException() { }
    MyException(String s) {
        str = s;
    }
}



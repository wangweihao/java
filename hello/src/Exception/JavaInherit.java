package Exception;

/**
 * Created by wwh on 15-6-3.
 */
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

class father{
    father(){

    }
    father(String s){
        System.out.println("i am father");
        System.out.println(s);
    }
}

class son extends father{
    son(){
        //super("hahaha");
        System.out.println("i am son");
    }
    void ff(){
    }

}

class logexception extends Exception{
    public static Logger logger = Logger.getLogger("LoggerException");
    public logexception(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class simpleException extends Exception{
    public simpleException(){

    }
}

class Foo{
    void f() throws NullPointerException, RuntimeException{
        try{
            throw new NullPointerException();
        }catch (Exception e) {
            System.out.println("haha");
            //System.out.println(e);
        }
    }
}

public class JavaInherit {
    public void f() throws simpleException{
        System.out.println("Throw SimpleException from f()");
        throw new simpleException();
    }
    public static void main(String[] args){
        JavaInherit ji = new JavaInherit();
        try{
            ji.f();
        }catch (simpleException e){
            System.out.println("caught it");
            e.printStackTrace();
        }
        son s = new son();
        String ss = null;
        try{
            ss.toString();
        }catch (Exception e) {
            System.out.println("hehehehehehe");

        }
        try {
            throw new logexception();
        } catch (logexception e) {
            System.out.println(e);
        }
        Foo f = new Foo();
        f.f();
    }
}

import sun.security.provider.SHA;

/**
 * Created by wwh on 15-5-31.
 */

abstract class Shape{

};

class yuan extends Shape{
    int i = 100;
    yuan(){
        super();
        System.out.println("yuan");
    }
    void huahua(){
        System.out.println("hua yuan:" + i);
    }
    static void hehe(Shape s){

    }
}

public class JavaDuoTai {
    public static void main(String[] args) {
        Shape s1 = new yuan();
    }
}

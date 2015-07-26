package BF;

/**
 * Created by wwh on 15-6-1.
 */
public class JavaInner {
    private void fun() {
        class Inner {

        }
    }
    public static void main(String[] args) {
        Outer o = new Outer();
    }
}

class Outer{
    private int i = 0;
    class Inner{
        int i;
        class IIINer{
            int j;
        }
    }
}

class TT implements JavaInterface{


    @Override
    public void haha(int i) {

    }

    @Override
    public void xixi(int j) {

    }
}

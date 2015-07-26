/**
 * Created by wwh on 15-5-7.
 */
public class This {
    int i;
    public This(int i) {
        this.i = i;
    }
    This increment(){
        ++i;
        return this;
    }
    void print(){
        System.out.println("i:" + i);
    }
    public static void main(String args[]){
        This t = new This(10);
        t.print();
        t.increment().increment().increment().print();
    }
}

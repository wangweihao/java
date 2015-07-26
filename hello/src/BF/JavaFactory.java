package BF;

/**
 * Created by wwh on 15-6-1.
 */
public class JavaFactory {
    public  static void runCycle(CycleFactory cf){
        Cycle cc = cf.getCycle();
        cc.move();
    }
    public static void main(String[] args){
        runCycle(Unicycle.factory);
        runCycle(Bicyle.factory);
    }
}

interface Cycle{
    void move();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    @Override
    public void move(){
        System.out.println("Unicycle run");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}
/*
class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle(){
        return new Unicycle();
    }
}
*/
class Bicyle implements Cycle{
    @Override
    public void move(){
        System.out.println("Bicyle run");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicyle();
        }
    };
}
/*
class BicyleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicyle();
    }
}
*/

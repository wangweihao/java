package vector;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by wwh on 15-6-1.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Apple> aa = new ArrayList<Apple>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        aa.add(a1);
        aa.add(a2);
        aa.add(a3);
        for(Apple ap : aa){
            ap.eat();
        }

        Collection<Integer> ai = new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4,5,6));
        for(Integer i : ai){
            System.out.println(i);
        }
    }
}

class Apple{
    int apple = 1;
    void eat(){
        apple--;
        System.out.println("apple is eated");
    }
}

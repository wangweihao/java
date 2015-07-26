package vector;

import sun.awt.image.ImageWatched;

import java.sql.Array;
import java.util.*;

/**
 * Created by wwh on 15-6-2.
 */
public class JavaGeneration {
    public static void main(String[] args){
        ArrayList<String>as = new ArrayList<String>(Arrays.<String>asList("123", "456", "789"));
        LinkedList<String>ls = new LinkedList<String >(Arrays.<String>asList("111", "222", "333"));
        ArrayList<Integer>l1 = new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4));
        List<Integer> l2 = l1.subList(1, 4);
        ListIterator<Integer> iter2 = l1.listIterator();
        iter2.next();
        System.out.println(iter2.previous().toString() + "xixixi");
        Iterator<Integer> iter = l2.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().toString() + "---");
        }
        //generation g = new generation(ls);
        //System.out.println(g.next());
        //System.out.println(g.next());
        //System.out.println(g.next());
        for(Integer s : l2){
            System.out.println(s);
        }
    }
}

class generation{
    int i;
    Collection<String>c;
    Iterator<String>iter;
    generation(Collection cc){
        c = cc;
        i = -1;
        iter = c.iterator();
    }
    String next(){
        if(i < c.size()){
            i++;
            return iter.next();
        }
        return null;
    }
}

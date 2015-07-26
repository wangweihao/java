import java.util.Random;

/**
 * Created by wwh on 15-5-7.
 */
import java.util.*;

public class loop2 {
    public static void main(String args[]){
        for(int i = 0; i < 25; ++i)
        {
            double t = Math.random();
            Random random = new Random(100);
            if(t > 0){
                System.out.println(">:" + random);
            }
            else if(t < 0){
                System.out.println("<:" + random);
            }else{
                System.out.println("==:" + random);
            }
        }
    }
}

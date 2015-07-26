/**
 * Created by wwh on 15-5-7.
 */
import static java.lang.System.out;

public class ForEach {
    public static void main(String args[]){
        int[] f = new int[10];
        for(int i = 0; i < 10; ++i){
            f[i] = i;
        }
        for(int i : f) {
            out.println(i);
        }
    }
}

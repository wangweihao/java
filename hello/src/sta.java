/**
 * Created by wwh on 15-5-7.
 */
public class sta {
    static int i;
    static int j;
    static {
        i = 10;
        j = 20;
        System.out.println("static called");
    }
    public static void main(String args[]){
        System.out.println(i);
        System.out.println(j);
        System.out.println(i + j);
        int t = 20;
        int t2 = 30;
        String s1;
        String s2;
        {
            s1 = "haha";
            s2 = "hehe";
        }
        System.out.println(s1 + "--" + s2);
    }
}

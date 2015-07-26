/**
 * Created by wwh on 15-5-7.
 */
public class three {
    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i){
        if(i < 10) {
            return i * 100;
        }else{
            return i * 10;
        }
    }
    public static void main(String args[]){
        System.out.println(ternary(11));
        System.out.println(standardIfElse(5));
    }
}

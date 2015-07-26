/**
 * Created by wwh on 15-5-7.
 */
public class label {
    public static void main(String args[]){
        outer:
        //System.out.println("outer");
        while(true){
            inner:
            //System.out.println("inner");
            for(int i = 0; i < 10; ++i){
                if(i == 4){
                    System.out.println("haha" + i);
                    continue outer;
                }else if(i == 7){
                    System.out.println("hehe" + i);
                    break outer;
                }
                else{
                    System.out.println("wuwu" + i);
                }
            }
        }
    }
}

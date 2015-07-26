/**
 * Created by wwh on 15-5-7.
 */
public class Rock {
    public Rock(int i, String s){
        System.out.println("int" + i);
    }
    public Rock(String str, int i) {
        System.out.println("construct be called");
        String s = new String();
        if(s == null) {
            System.out.println("..." + s);
        }else{
            System.out.println("---" + s);
        }
        ss = str;
        System.out.println(ss);
        System.out.println(sss);
    }

    public static void main(String args[]){
        Rock r = new Rock("hahahahahhahaha", 1000);
        System.out.println(r);
        Rock r2 = new Rock(1000, "hahaha");
    }

    String ss;
    static String sss = "hahahah";
}


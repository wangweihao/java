import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

/**
 * Created by wwh on 15-7-27.
 */
public class AnalysisJson {
    public static void main(String[] args){
        //解析单个json对象
        String s = " { \"mark\" : 1, \"phonenumber\" : \"18829290435\" } ";
        JSONObject oj = new JSONObject(s);
        int mark = oj.getInt("mark");
        String phonenumber = oj.getString("phonenumber");
        System.out.println("mark:" + mark + "  phonenumber:" + phonenumber);
        //创建一个json对象
        JSONObject oj2 = new JSONObject();
        oj2.put("result", 0);
        System.out.println(oj2);
        //
    }
}

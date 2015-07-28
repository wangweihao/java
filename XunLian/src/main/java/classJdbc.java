/**
 * Created by wwh on 15-6-9.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class classJdbc {
    static int cnt = 0;
    public static void main (String[] args){
        String url = "jdbc:mysql://localhost:3306/XL_db?useUnicode=true&characterEncoding=gbk";
        String username = "root";
        String password = "w13659218813";
        String sql = "select * from UserInfo";
        for(int i = 0; i < 10; i++){
            long begin = System.currentTimeMillis();
            Connection con = null;
            try{
                con = DriverManager.getConnection(url, username, password);
                //System.out.println("数据库连接成功");
                PreparedStatement ps = con.prepareStatement(sql);
                //System.out.println("数据库sql语句执行成功");
                ResultSet rs = ps.executeQuery();
                cnt++;
                //System.out.println("数据库查询成功 : " + cnt);
                    /*while(rs.next()){
                        System.out.println("id:" + rs.getInt(1) + " password:" + rs.getString(2) + " head:"
                                + rs.getString(3) + " intro:" + rs.getString(4));
                    }*/
                if(rs != null){
                    try{
                        con.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }catch (SQLException se) {
                System.out.println("数据库连接失败");
                System.out.println(cnt);
                se.printStackTrace();
            }
            long end = System.currentTimeMillis();
            System.out.println((i+1) + " time is:" + (end - begin));
        }
    }
}

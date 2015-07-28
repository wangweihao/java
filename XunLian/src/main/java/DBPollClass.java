import com.mchange.v2.c3p0.ComboPooledDataSource;
import io.netty.channel.ChannelPromiseNotifier;

import java.awt.color.ProfileDataException;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Created by wwh on 15-6-10.
 */
public class DBPollClass {
    private static DBPollClass dbPoll;
    private ComboPooledDataSource dbSource;

    static {
        dbPoll = new DBPollClass();
    }

    public DBPollClass(){
        try{
            dbSource = new ComboPooledDataSource();
            dbSource.setUser("root");
            dbSource.setPassword("w13659218813");
            dbSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/XL_db?user=root&password=w13659218813&useUnicode=true");
            dbSource.setDriverClass("com.mysql.jdbc.Driver");
            dbSource.setInitialPoolSize(1);
            dbSource.setMinPoolSize(2);
            dbSource.setMaxPoolSize(10);
            dbSource.setMaxStatements(50);
            dbSource.setMaxIdleTime(60);
        }catch (PropertyVetoException e){
            throw new RuntimeException(e);
        }
    }

    public final static DBPollClass getInstance(){
        return dbPoll;
    }

    public final Connection getConnection(){
        try{
            return dbSource.getConnection();
        }catch (SQLException e){
            throw new RuntimeException("无法获取连接", e);
        }
    }


    void getResult(int mark, String data)throws SQLException{
        Connection con = null;
        String result = null;
        try{
            //获取一个连接
            con = dbPoll.getInstance().getConnection();
            switch (mark){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(con != null){
                //归还一个连接
                con.close();
            }
        }
    }


    public static void main(String[] args) throws SQLException {
        for(int i = 0; i < 100000; i++) {
            long begintime = System.currentTimeMillis();
            Connection con = null;
            try {
                //取得空闲连接
                con = dbPoll.getInstance().getConnection();
                //ResultSet rs = con.createStatement().executeQuery("SELECT * from UserInfo");
                PreparedStatement pst = con.prepareStatement("SELECT * from UserInfo");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getObject(1) + " " + rs.getObject(2) + " " + rs.getObject(3) + " " + rs.getObject(4));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    //归还空闲连接
                    con.close();
                }
            }
            long endtime = System.currentTimeMillis();
            System.out.println((i+1) + " time is:" + (endtime-begintime));
        }
    }
}

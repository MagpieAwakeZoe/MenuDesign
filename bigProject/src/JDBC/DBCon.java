package JDBC;
import com.sun.org.apache.bcel.internal.generic.Select;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by by on 2017/12/25.
 */
public class DBCon {
    private static Statement statement=null;
    private static Connection conn=null;
    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "";

        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
               //创建Statement对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static List<MenuModel> getMenuData(){
        try {
            conn =getConn();
            statement  = conn.createStatement();
            String sql = "select * from menu";
            ResultSet rs = statement.executeQuery(sql);      //创建数据库对象
            List<MenuModel> list = new ArrayList();
            while (rs.next()){
                String MenuId = rs.getString(1);
                String Menu0Name = rs.getString(2);
                String Menu1Name = rs.getString(3);
                String Menu2Name = rs.getString(4);
                MenuModel menumodel = new MenuModel(MenuId,Menu0Name,Menu1Name,Menu2Name);
                list.add(menumodel);
            }
            return list;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        List<MenuModel> list = getMenuData();
        for (MenuModel m:list
             ) {
            System.out.println(m.getMENUID()+" "+m.getMENU0NMAE()+" "+m.getMENU1NAME()+" "+m.getMENU2NAME());
        }
    }
}

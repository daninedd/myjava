package com.denglei;

import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**@author denglei
 * Created by Administrator on 2017/12/22.
 */
public class Demo extends SQLException{

    public static void main(String[] args) {

        Demo x = new Demo();
        x.select();
    }

    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/xiao_shou_dian";
        String username = "root";
        String password = "";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    Connection conn = getConn();
    public void select(){
        String sql = "select * from xsd_user";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("============================");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    if ((i == 2) && (rs.getString(i).length() < 8)) {
                        System.out.print("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


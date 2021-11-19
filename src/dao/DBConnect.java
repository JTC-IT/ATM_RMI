/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author trung
 */
public class DBConnect {
    private Connection connect;
    private final String url;
    private final String user;
    private final String password;

    public Connection Connect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        System.out.println("Đã xác định máy chủ");
        connect = DriverManager.getConnection(url,user,password);
//        System.out.println("Đã kết nối ATM DB thành công!");
        return connect;
    }

    public DBConnect(){
        super(); 
        url = "jdbc:sqlserver://localhost:1433;databaseName=ATM_RMI";
        user = "chinh";
	password = "ttc0206";
    }
    
    public void close() throws Exception {
        connect.close();
    }
}

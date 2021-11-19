/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.TaiKhoan;
import java.sql.*;

/**
 *
 * @author trung
 */
public class TaiKhoanDao {
    private String sql;
    
    public TaiKhoan getTaiKhoan(String SoTaiKhoan, String MatKhau)throws Exception
    {
        DBConnect db = new DBConnect();
        TaiKhoan tk = null;
        sql = "select * from TaiKhoan where SoTaiKhoan = ? and MatKhau = ?";
        
        PreparedStatement ps = db.Connect().prepareStatement(sql);
        ps.setString(1, SoTaiKhoan);
        ps.setString(2, MatKhau);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            tk = new TaiKhoan(rs.getString("SoTaiKhoan"), rs.getString("Hoten"), rs.getLong("SoDu"), rs.getString("MatKhau"));
        }
        rs.close();
        ps.close();
        db.close();
        return tk;
    }
    
    public int RutTien(String SoTaiKhoan, long SoTien, String NoiDung) throws Exception
    {
        int result = 0;
        DBConnect db = new DBConnect();
        sql = "{call proc_RutTien(?,?,?,?)}";
        
        CallableStatement cs = db.Connect().prepareCall(sql);
        cs.setString(1, SoTaiKhoan);
        cs.setLong(2, SoTien);
        cs.setString(3, NoiDung);
        cs.registerOutParameter(4, Types.INTEGER);
        cs.execute();
        result = cs.getInt(4);
        cs.close();
        db.close();
        return result;
    }
    
    public int ChuyenTien(String SoTaiKhoan, String SoTaiKhoanNhan, long SoTien) throws Exception
    {
        int result = 0;
        DBConnect db = new DBConnect();
        sql = "{call proc_ChuyenTien(?,?,?,?)}";
        
        CallableStatement cs = db.Connect().prepareCall(sql);
        cs.setString(1, SoTaiKhoan);
        cs.setString(2, SoTaiKhoanNhan);
        cs.setLong(3, SoTien);
        cs.registerOutParameter(4, Types.INTEGER);
        cs.execute();
        result = cs.getInt(4);
        cs.close();
        db.close();
        return result;
    }
}

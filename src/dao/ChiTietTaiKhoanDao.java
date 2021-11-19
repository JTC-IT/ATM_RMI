/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.ChiTietTaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author trung
 */
public class ChiTietTaiKhoanDao {
    private String sql;
    
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoans(String SoTaiKhoan) throws Exception
    {
        DBConnect db = new DBConnect();
        ArrayList<ChiTietTaiKhoan> list = new ArrayList<ChiTietTaiKhoan>();
        sql = "select * from ChiTietTaiKhoan where SoTaiKhoan = ?";
        
        PreparedStatement ps = db.Connect().prepareStatement(sql);
        ps.setString(1, SoTaiKhoan.trim());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int Id = rs.getInt("Id");
            Date NgayRutTien = rs.getDate("NgayGiaoDich");
            long SoTienRut = rs.getLong("SoTien");
            String NoiDung =rs.getString("NoiDung");
            boolean LoaiGiaoDich = rs.getBoolean("LoaiGiaoDich");
            list.add(new ChiTietTaiKhoan(Id, NgayRutTien, SoTienRut, SoTaiKhoan, NoiDung, LoaiGiaoDich));
        }
        rs.close();
        ps.close();
        db.close();
        return list;
    }
}

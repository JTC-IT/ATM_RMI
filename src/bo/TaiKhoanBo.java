/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import Dao.TaiKhoanDao;
import bean.TaiKhoan;

/**
 *
 * @author trung
 */
public class TaiKhoanBo {
    public TaiKhoan Login(String SoTaiKhoan, String MatKhau)throws Exception
    {
        TaiKhoanDao dao = new TaiKhoanDao();
        return dao.getTaiKhoan(SoTaiKhoan, MatKhau);
    }
    
    public String getTaiKhoan(String SoTaiKhoan)throws Exception
    {
        TaiKhoanDao dao = new TaiKhoanDao();
        return dao.getTaiKhoan(SoTaiKhoan);
    }
    
    public int RutTien(String SoTaiKhoan, long SoTienRut, String NoiDung) throws Exception{
        TaiKhoanDao dao = new TaiKhoanDao();
        return dao.RutTien(SoTaiKhoan, SoTienRut, NoiDung);
    }
    
    public int ChuyenTien(String SoTaiKhoan, String SoTaiKhoanNhan, long SoTien) throws Exception{
        TaiKhoanDao dao = new TaiKhoanDao();
        return dao.ChuyenTien(SoTaiKhoan, SoTaiKhoanNhan, SoTien);
    }
}

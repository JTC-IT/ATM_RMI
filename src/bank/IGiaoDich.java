/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author trung
 */
public interface IGiaoDich extends Remote {
    public TaiKhoan Login(String SoTaiKhoan, String MatKhau)throws Exception;
    public String getTaiKhoan(String SoTaiKhoan)throws Exception;
    public int RutTien(String SoTaiKhoan, long SoTienRut, String NoiDung) throws Exception;
    public int ChuyenTien(String SoTaiKhoan, String SoTaiKhoanNhan, long SoTien) throws Exception;
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoans(String SoTaiKhoan) throws Exception;
}

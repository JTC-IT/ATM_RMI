/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import bo.ChiTietTaiKhoanBo;
import bo.TaiKhoanBo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author trung
 */
public class GiaoDich extends UnicastRemoteObject implements IGiaoDich {

    
    private TaiKhoanBo tkbo;
    private ChiTietTaiKhoanBo ctbo;
    
    public GiaoDich() throws RemoteException
    {
        tkbo = new TaiKhoanBo();
        ctbo = new ChiTietTaiKhoanBo();
    }
    
    @Override
    public TaiKhoan Login(String SoTaiKhoan, String MatKhau) throws Exception {
        return tkbo.Login(SoTaiKhoan, MatKhau);
    }

    @Override
    public int RutTien(String SoTaiKhoan, long SoTienRut, String NoiDung) throws Exception {
        return tkbo.RutTien(SoTaiKhoan, SoTienRut, NoiDung);
    }

    @Override
    public int ChuyenTien(String SoTaiKhoan, String SoTaiKhoanNhan, long SoTien) throws Exception {
        return tkbo.ChuyenTien(SoTaiKhoan, SoTaiKhoanNhan, SoTien);
    }

    @Override
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoans(String SoTaiKhoan) throws Exception {
        return ctbo.getChiTietTaiKhoans(SoTaiKhoan);
    }
    
}

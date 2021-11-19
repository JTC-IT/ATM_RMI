/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author trung
 */
public class TaiKhoan implements Serializable{
    private String SoTaiKhoan;
    private String HoTen;
    private long SoDu;
    private String MatKhau;

    public TaiKhoan(String SoTaiKhoan, String HoTen, long SoDu, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTen = HoTen;
        this.SoDu = SoDu;
        this.MatKhau = MatKhau;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public long getSoDu() {
        return SoDu;
    }

    public void setSoDu(long SoDu) {
        this.SoDu = SoDu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
}

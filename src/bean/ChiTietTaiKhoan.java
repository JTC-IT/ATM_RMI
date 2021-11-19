/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author trung
 */
public class ChiTietTaiKhoan implements Serializable {

    private int Id;
    private Date NgayRutTien;
    private long SoTienRut;
    private String SoTaiKhoan;
    private String NoiDung;
    private boolean LoaiGiaoDich;

    public ChiTietTaiKhoan(int Id, Date NgayRutTien, long SoTienRut, String SoTaiKhoan, String GhiChu, boolean LoaiGiaoDich) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRut = SoTienRut;
        this.SoTaiKhoan = SoTaiKhoan;
        this.NoiDung = GhiChu;
        this.LoaiGiaoDich = LoaiGiaoDich;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public long getSoTienRut() {
        return SoTienRut;
    }

    public void setSoTienRut(long SoTienRut) {
        this.SoTienRut = SoTienRut;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public boolean getLoaiGiaoDich() {
        return LoaiGiaoDich;
    }

    public void setLoaiGiaoDich(boolean LoaiGiaoDich) {
        this.LoaiGiaoDich = LoaiGiaoDich;
    }

}

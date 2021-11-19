/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import Dao.ChiTietTaiKhoanDao;
import bean.ChiTietTaiKhoan;
import java.util.ArrayList;

/**
 *
 * @author trung
 */
public class ChiTietTaiKhoanBo {
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoans(String SoTaiKhoan) throws Exception
    {
        ChiTietTaiKhoanDao dao = new ChiTietTaiKhoanDao();
        return dao.getChiTietTaiKhoans(SoTaiKhoan);
    }
}

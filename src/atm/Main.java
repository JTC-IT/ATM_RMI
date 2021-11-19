/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import bean.TaiKhoan;

/**
 *
 * @author trung
 */
public class Main {
    private static TaiKhoan user;
    
    public Main(){
        user = null;
    }
    
    public static void subSoDu(long tru){
        user.setSoDu(user.getSoDu()-tru);
    }

    public static TaiKhoan getUser() {
        return user;
    }

    public static void setUser(TaiKhoan user) {
        Main.user = user;
        if(user != null)
            new frmATM().setVisible(true);
        else new frmLogin().setVisible(true);
    }
    
    public static void main(String[] args) {
        new frmLogin().setVisible(true);
    }
}

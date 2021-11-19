/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author trung
 */
public class BANK_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            java.rmi.registry.Registry r = LocateRegistry.createRegistry(1099);
            GiaoDich giaoDich = new GiaoDich();
            //UnicastRemoteObject.exportObject(tt);
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/GiaoDich", giaoDich);
            System.out.print("Da cho may khach goi den!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

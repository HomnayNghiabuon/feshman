/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nghia.btth2;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class BTTH2 {

    public static void main(String[] args) {
        SanPham sp1 = new Sach("A", 14.5, 123);
        SanPham sp2 = new Sach();
        sp2.nhap();
        QuanLySanPham q1 = new QuanLySanPham();
        q1.themSanPham(sp1, sp2);
        q1.hienThi();
        try {
            q1.themSanPham("Sach");
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(BTTH2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

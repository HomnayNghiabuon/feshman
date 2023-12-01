/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.btth2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLySanPham {
    List<SanPham> danhSachSanPham;
    public QuanLySanPham(){
        this.danhSachSanPham = new ArrayList<>();
    }
    public void themSanPham(SanPham... a){
        this.danhSachSanPham.addAll(Arrays.asList(a));
    }
    public void themSanPham(String classPath) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Class c = Class.forName(classPath);
        SanPham s = (SanPham) c.getConstructor().newInstance();
        s.nhap();
        this.danhSachSanPham.add(s);
    }
    public void hienThi(){
        this.danhSachSanPham.forEach(a -> a.hienThi());
    }
}

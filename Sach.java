/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.btth2;

/**
 *
 * @author admin
 */
public class Sach extends SanPham {
    private int soTrang;

    public Sach() {
    }
    
    public Sach(String ten, double giaBan, int soStrang) {
        super(ten, giaBan);
        this.soTrang = soStrang;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap so trang");
        this.soTrang = Integer.parseInt(CauHinh.sc.nextLine());
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("So trang: %d\n", this.soTrang);
    }
}

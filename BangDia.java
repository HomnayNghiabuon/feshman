/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.btth2;

import java.time.LocalDateTime;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private LocalDateTime thoiGianPhat;

    public BangDia() {
    }
    
    public BangDia(String ten, double giaBan, LocalDateTime thoiGianPhat) {
        super(ten, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("So trang: %d\n", this.thoiGianPhat);
    }
}

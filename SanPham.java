/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.btth2;

/**
 *
 * @author admin
 */
public class SanPham {
    private static int dem;
    private int ma = ++dem;
    private String ten;
    private double giaBan;
    
    public SanPham(){
        
    }
    public SanPham(String ten, double giaBan) {
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        SanPham.dem = dem;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap(){
        System.out.println("Nhap ten sp");
        this.ten = CauHinh.sc.nextLine();
        System.out.println("Nhap gia san pham");
        this.giaBan = Double.parseDouble(CauHinh.sc.nextLine());
    }
    public void hienThi(){
        System.out.printf("Ma sp: %d\nTen sp: %s\nGia ban: %.1f\n", this.ma, this.ten, this.giaBan);
    }
}

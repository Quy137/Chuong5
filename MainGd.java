/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDich;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class MainGd {
    public static void main(String[] args) {
        DanhSachGiaoDich ds = new DanhSachGiaoDich();
        ds.nhap(3);
        ds.xuat();
        ds.tinhTrungBinhTien();
        ds.tongSoLuongTungLoai();
        ds.GD1ty();
    }
}

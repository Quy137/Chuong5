/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class Test {
    
    private static HinhTron nhapHinhTron(){
        System.out.println("Nhap ban kinh hinh tron : ");
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        return new HinhTron(r);
    }
    
    private static HinhChuNhat nhapHinhChuNhat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat :");
        float cd = input.nextFloat();
        System.out.println("Nhap chieu rong hinh chu nhat :");
        float cr = input.nextFloat();
        return new HinhChuNhat(cd , cr);
    }
    public static void main(String[] args) {
        HinhTron ht = nhapHinhTron();
        HinhChuNhat hcn = nhapHinhChuNhat();
        System.out.println("Thong tin hinh chu nhat :" + hcn.toString() + "Dien tich" + hcn.dienTich());
        System.out.println("Thong tin hinh tron :" + ht.toString() + "Dien tich" + ht.dienTich());
        
        DanhSachHinh ds = new DanhSachHinh();
        System.out.println("Danh sach cac hinh");
        ds.Them(ht);
        ds.Them(hcn);
    }
}

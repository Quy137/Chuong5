/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDich;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class DanhSachGiaoDich {
    ArrayList<GiaoDich> listGiaoDich;
    Scanner sc;
    GiaoDich gd;
    int chon;

    public DanhSachGiaoDich() {
        super();
        listGiaoDich = new ArrayList<GiaoDich>();
        sc = new Scanner(System.in);
    }
    
    public void nhap(int n) {
        for(int i = 0; i < n ; i++) {
            System.out.println("1: Giao dich vang");
            System.out.println("2: Giao dich tien te");
            System.out.println("0: Thoat");
            chon = sc.nextInt();sc.nextLine();
            switch(chon) {
                case 1:{
                    String maGiaoDich, loaiVang;
                    int ngayGiaoDich, soLuong;
                    double donGia;
                    System.out.println("Nhap loai vang : "); loaiVang = sc.nextLine();
                    System.out.println("Nhap ma giao dich : "); maGiaoDich= sc.nextLine();
                    System.out.println("Nhap don gia"); donGia = sc.nextDouble();
                    System.out.println("Nhap ngay giao dich : "); ngayGiaoDich = sc.nextInt();
                    System.out.println("Nhap so luong : "); soLuong = sc.nextInt();
                    gd = new GiaoDichVang(loaiVang, maGiaoDich, donGia, ngayGiaoDich, soLuong);
                    listGiaoDich.add(gd);
                    System.out.println("Add thanh cong giao dich vang");
                }
                break;
                case 2: {
                    String maGiaoDich, loaiTien;
                    int ngayGiaoDich, soLuong;
                    double donGia, tiGia;
                    System.out.println("Nhap loai tien : "); loaiTien = sc.nextLine();
                    System.out.println("Nhap ti gia : "); tiGia = sc.nextDouble(); sc.nextLine();
                    System.out.println("Nhap ma giao dich : "); maGiaoDich= sc.nextLine();
                    System.out.println("Nhap don gia : "); donGia = sc.nextDouble(); sc.nextLine();
                    System.out.println("Nhap ngay giao dich : "); ngayGiaoDich = sc.nextInt(); sc.nextLine();
                    System.out.println("Nhap so luong : "); soLuong = sc.nextInt(); sc.nextLine();
                    gd = new GiaoDichTienTe(loaiTien, tiGia, maGiaoDich, donGia, ngayGiaoDich, soLuong);
                    listGiaoDich.add(gd);
                    System.out.println("Add thanh cong giao dich tien te");
                    
                }
                break;
                default:
                    break;
            }
        }
    }
    
    public void xuat() {
        for(GiaoDich gd : listGiaoDich) {
            System.out.println(gd.toString());
        }
    }
    public void tongSoLuongTungLoai() {
        int soLuongVang = 0, soLuongTienTe = 0;
        for(GiaoDich gd : listGiaoDich) {
            if (gd instanceof GiaoDichVang) {
                soLuongVang += gd.getSoLuong();
            }
            if (gd instanceof GiaoDichTienTe) {
                soLuongTienTe += gd.getSoLuong();
            }
            
        }
        System.out.println("Tong so luong giao dich vang : " + soLuongVang);
        System.out.println("Tong so luong giao dich tien te : " + soLuongTienTe);
    }
    public void tinhTrungBinhTien() {
        double tb;
        for(GiaoDich gd : listGiaoDich){
            if(gd instanceof GiaoDichTienTe) {
            tb = (gd.thanhTien()/gd.soLuong);
            
        System.out.println("Trung binh giao dich tien te la : " + tb );}
        }
        
    }
    public void GD1ty() {
        for(GiaoDich gd : listGiaoDich) {
            if(gd.donGia > 1000) {
                System.out.println("Giao dich tren 1 ty " + gd.toString());
            }
        }
    }
}

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
public class GiaoDichTienTe extends GiaoDich {
    private String loaiTien;
    private double tiGia;

    public GiaoDichTienTe(String loaiTien, double tiGia, String maGiaoDich, double donGia, int ngayGiaoDich, int soLuong) {
        super(maGiaoDich, donGia, ngayGiaoDich, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public double thanhTien() {
        double thanhTien;
        if(loaiTien.equals("VN")) {
            thanhTien = this.getDonGia()*this.getSoLuong();
        }
        else if(loaiTien.equals("USD || Euro")) {
            thanhTien = this.getDonGia()*this.getTiGia()*this.getSoLuong();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichTienTe{" + "loaiTien=" + loaiTien + ", tiGia=" + tiGia + '}';
    }   
    
}

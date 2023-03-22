/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDich;

/**
 *
 * @author Wys.Dao
 */
public class GiaoDich {
    protected String maGiaoDich;
    protected double donGia;
    protected int ngayGiaoDich, soLuong;

    public GiaoDich(String maGiaoDich, double donGia, int ngayGiaoDich, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soLuong = soLuong;
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
    
    public double thanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGiaoDich=" + maGiaoDich + ", donGia=" + donGia + ", ngayGiaoDich=" + ngayGiaoDich + ", soLuong=" + soLuong + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDich;

/**
 *
 * @author Wys.Dao
 */
public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang(String loaiVang, String maGiaoDich, double donGia, int ngayGiaoDich, int soLuong) {
        super(maGiaoDich, donGia, ngayGiaoDich, soLuong);
        this.loaiVang = loaiVang;
    }

    

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
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
        return thanhTien = this.getSoLuong()*this.getDonGia();
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichVang{" + "loaiVang=" + loaiVang + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

import java.util.ArrayList;

/**
 *
 * @author Wys.Dao
 */
public class DanhSachHinh {
    ArrayList<Hinh> listHinh;

    public DanhSachHinh(ArrayList<Hinh> listHinh) {
       this.listHinh = listHinh;
    }

    public DanhSachHinh() {
    }
    
    
    public void Them(Hinh hinh) {
        this.listHinh.add(hinh);
    }
    public void inDanhSach() {
        for(Hinh hinh : listHinh){
            System.out.println(hinh.toString());
        };
    }
}

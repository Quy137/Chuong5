/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

/**
 *
 * @author Wys.Dao
 */
public class HinhChuNhat extends Hinh{
    private float cd, cr;
    

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }
    
    @Override
    public double dienTich(){
        double dt;
        return dt = this.cd*this.cr;
    }
}

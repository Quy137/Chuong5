/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

/**
 *
 * @author Wys.Dao
 */
public class HinhTron extends Hinh{
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

   
    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    
    @Override
    public double dienTich(){
        double dt;
        return dt = r*r*3.14;
    }
}

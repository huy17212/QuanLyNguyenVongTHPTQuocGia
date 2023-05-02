/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Huy1721
 */
public class MonThi {

    private String tenMon;
    private Double diemThi;

    public MonThi(String tenMon) {
        this.tenMon = tenMon;
    }

    public MonThi(String tenMon, Double diemThi) {
        this.tenMon = tenMon;
        this.diemThi = diemThi;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public Double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(Double diemThi) {
        this.diemThi = diemThi;
    }

    @Override
    public String toString() {
        return "MonThi{" + "tenMon=" + tenMon + ", diemThi=" + diemThi + '}';
    }

}

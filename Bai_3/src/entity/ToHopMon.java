/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author Huy1721
 */
public class ToHopMon {

    private String maToHopMon;
    private String tenToHopMon;
    private List<MonThi> danhSachMonThi;

    public ToHopMon(String maToHopMon, String tenToHopMon, List<MonThi> danhSachMonThi) {
        this.maToHopMon = maToHopMon;
        this.tenToHopMon = tenToHopMon;
        this.danhSachMonThi = danhSachMonThi;
    }

    public String getMaToHopMon() {
        return maToHopMon;
    }

    public void setMaToHopMon(String maToHopMon) {
        this.maToHopMon = maToHopMon;
    }

    public String getTenToHopMon() {
        return tenToHopMon;
    }

    public void setTenToHopMon(String tenToHopMon) {
        this.tenToHopMon = tenToHopMon;
    }

    public List<MonThi> getDanhSachMonThi() {
        return danhSachMonThi;
    }

    public void setDanhSachMonThi(List<MonThi> danhSachMonThi) {
        this.danhSachMonThi = danhSachMonThi;
    }

    @Override
    public String toString() {
        return "ToHopMon{" + "maToHopMon=" + maToHopMon + ", tenToHopMon=" + tenToHopMon + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Set;
import mock.MockData;

/**
 *
 * @author Huy1721
 */
public class GiamThi {

    private String maGiamThi;
    private String tenGiamThi;
    private String donViCongTac;
    private Boolean gioiTinh;
    private Integer namSinh;
    private String queQuan;

    public GiamThi() {

    }

    public GiamThi(String maGiamThi, String tenGiamThi, String donViCongTac, Boolean gioiTinh, Integer namSinh, String queQuan) {
        this.maGiamThi = maGiamThi;
        this.tenGiamThi = tenGiamThi;
        this.donViCongTac = donViCongTac;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getMaGiamThi() {
        return maGiamThi;
    }

    public void setMaGiamThi(String maGiamThi) {
        this.maGiamThi = maGiamThi;
    }

    public String getTenGiamThi() {
        return tenGiamThi;
    }

    public void setTenGiamThi(String tenGiamThi) {
        this.tenGiamThi = tenGiamThi;
    }

    public String getDonViCongTac() {
        return donViCongTac;
    }

    public void setDonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    public String getGioiTinh() {
        if (this.gioiTinh) {
            return "Nam";
        }
        return "Nữ";
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void xuatThongGiamThi(GiamThi entity) {
        System.out.println("\nThông tin của giám thị " + entity.getTenGiamThi() + " với mã số báo danh là " + entity.getMaGiamThi() + ".");;
        System.out.println("Giới tính: " + entity.getGioiTinh());
        System.out.println("Sinh năm: " + entity.getNamSinh());
        System.out.println("Quê quán tại: " + entity.getQueQuan());
        System.out.println("Địa điểm tiến hành công tác: " + entity.getDonViCongTac());
    }

    public GiamThi timKiemGiamThiTheoMaGiamThi(String maGiamThi) {
        for (String itemKey : MockData.danhSachGiamThi.keySet()) {
            if (itemKey.equals(maGiamThi)) {
                return MockData.danhSachGiamThi.get(itemKey);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GiamThi{" + "maGiamThi=" + maGiamThi + ", tenGiamThi=" + tenGiamThi + ", donViCongTac=" + donViCongTac + ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + ", queQuan=" + queQuan + '}';
    }

}

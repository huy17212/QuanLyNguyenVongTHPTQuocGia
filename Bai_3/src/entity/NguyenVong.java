/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;
import mock.MockData;

/**
 *
 * @author Huy1721
 */
public class NguyenVong {

    private String maNguyenVong;
    private String tenNganhNguyenVong;
    private String maTruongDaiHoc;
    private Double diemChuan;
    private Integer diemDanhGiaNangLuc;
    private ToHopMon toHopMonDanhGia;
    private Double diemBienThien;
    private Date hanChot;
    private Integer soLuong;

    public NguyenVong() {
    }

    public NguyenVong(String maNguyenVong, String tenNganhNguyenVong, String maTruongDaiHoc, Double diemChuan, Integer diemDanhGiaNangLuc, ToHopMon toHopMonDanhGia, Double diemBienThien, Date hanChot, Integer soLuong) {
        this.maNguyenVong = maNguyenVong;
        this.tenNganhNguyenVong = tenNganhNguyenVong;
        this.maTruongDaiHoc = maTruongDaiHoc;
        this.diemChuan = diemChuan;
        this.diemDanhGiaNangLuc = diemDanhGiaNangLuc;
        this.toHopMonDanhGia = toHopMonDanhGia;
        this.diemBienThien = diemBienThien;
        this.hanChot = hanChot;
        this.soLuong = soLuong;
    }

    public String getMaNguyenVong() {
        return maNguyenVong;
    }

    public void setMaNguyenVong(String maNguyenVong) {
        this.maNguyenVong = maNguyenVong;
    }

    public String getTenNganhNguyenVong() {
        return tenNganhNguyenVong;
    }

    public void setTenNganhNguyenVong(String tenNganhNguyenVong) {
        this.tenNganhNguyenVong = tenNganhNguyenVong;
    }

    public String getMaTruongDaiHoc() {
        return maTruongDaiHoc;
    }

    public void setMaTruongDaiHoc(String maTruongDaiHoc) {
        this.maTruongDaiHoc = maTruongDaiHoc;
    }

    public Double getDiemChuan() {
        return diemChuan;
    }

    public void setDiemChuan(Double diemChuan) {
        this.diemChuan = diemChuan;
    }

    public Integer getDiemDanhGiaNangLuc() {
        return diemDanhGiaNangLuc;
    }

    public void setDiemDanhGiaNangLuc(Integer diemDanhGiaNangLuc) {
        this.diemDanhGiaNangLuc = diemDanhGiaNangLuc;
    }

    public ToHopMon getToHopMonDanhGia() {
        return toHopMonDanhGia;
    }

    public void setToHopMonDanhGia(ToHopMon toHopMonDanhGia) {
        this.toHopMonDanhGia = toHopMonDanhGia;
    }

    public Double getDiemBienThien() {
        return diemBienThien;
    }

    public void setDiemBienThien(Double diemBienThien) {
        this.diemBienThien = diemBienThien;
    }

    public Date getHanChot() {
        return hanChot;
    }

    public void setHanChot(Date hanChot) {
        this.hanChot = hanChot;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public void xuatThongTinChuyenNganhDaiHoc(NguyenVong entity) {
        System.out.println("Chuyên ngành: " + entity.getTenNganhNguyenVong());
        System.out.println("Tổ hợp môn đánh giá: " + entity.getToHopMonDanhGia());
        System.out.println("Điểm chuẩn: " + entity.getToHopMonDanhGia());
        System.out.println("Ngày hết hạn: " + entity.getHanChot());
    }

    public String toString(int thuTuNguyenVong) {
        return "Nguyện vọng thứ " + thuTuNguyenVong + " \n{" + "\n\t maNguyenVong=" + maNguyenVong + ",\n\t tenNganhNguyenVong=" + tenNganhNguyenVong + ",\n\t maTruongDaiHoc=" + maTruongDaiHoc + ",\n\t diemChuan=" + diemChuan + ",\n\t diemDanhGiaNangLuc=" + diemDanhGiaNangLuc + ",\n\t toHopMonDanhGia=" + toHopMonDanhGia + ",\n\t diemBienThien=" + diemBienThien + ",\n\t hanChot=" + hanChot + ",\n\t soLuong=" + soLuong + "\n}";
    }

    public NguyenVong checkMaNguyenVongIsValid(String maNguyenVong) {
        for (NguyenVong itemNguyenVong : MockData.danhSachNguyenVong) {
            if (itemNguyenVong.getMaNguyenVong().equals(maNguyenVong)) {
                return itemNguyenVong;
            }
        }
        return null;
    }

    public void themNguyenVong(String maNguyenVong, String maBaoDanh) {
        NguyenVong nguyenVongMuonThem = checkMaNguyenVongIsValid(maNguyenVong);
        if (nguyenVongMuonThem != null) {
            MockData.danhSachThiSinh.get(maBaoDanh)
                    .getDanhSachNguyenVong().put(MockData.danhSachThiSinh
                            .get(maBaoDanh).getDanhSachNguyenVong().size(), nguyenVongMuonThem);
        } else {
            System.out.println("Mã nguyện vọng không tồn tại!");
        }
    }

    public void xoaNguyenVong(Integer thuTu, String maSoBaoDanh) {
        MockData.danhSachThiSinh.get(maSoBaoDanh).getDanhSachNguyenVong().remove(thuTu);
    }

    public void xoaHetNguyenVong(String maSoBaoDanh) {
        MockData.danhSachThiSinh.get(maSoBaoDanh).getDanhSachNguyenVong().clear();
    }

    public void dieuChinhNguyenVong(Integer nguyenVong, Integer viTriMoi, String maSoBaoDanh) {
        MockData.danhSachThiSinh.get(maSoBaoDanh)
                .getDanhSachNguyenVong().replace(nguyenVong, MockData.danhSachThiSinh.get(maSoBaoDanh)
                        .getDanhSachNguyenVong().get(viTriMoi));
    }

}

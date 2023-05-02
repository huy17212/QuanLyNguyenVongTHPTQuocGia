/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mock.MockData;

/**
 *
 * @author Huy1721
 */
public class ThiSinh {

    private String soBaoDanh;
    private String hoTen;
    private Boolean gioiTinh;
    private Integer namSinh;
    private String queQuan;
    private List<MonThi> diemThi;
    private Double diemUuTien;
    private Map<Integer, NguyenVong> danhSachNguyenVong;
    private Integer diemThiNangLuc;
    private String diaDiemThi;
    private Boolean banHoc;

    public ThiSinh(String soBaoDanh, String hoTen, Boolean gioiTinh, Integer namSinh, String queQuan, List<MonThi> diemThi, Double diemUuTien, Map<Integer, NguyenVong> danhSachNguyenVong, Integer diemThiNangLuc, String diaDiemThi, Boolean banHoc) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.diemThi = diemThi;
        this.diemUuTien = diemUuTien;
        this.danhSachNguyenVong = danhSachNguyenVong;
        this.diemThiNangLuc = diemThiNangLuc;
        this.diaDiemThi = diaDiemThi;
        this.banHoc = banHoc;
    }

    public ThiSinh() {

    }

    public String getBanHoc() {
        if (this.banHoc) {
            return "Ban tự nhiên";
        }
        return "Ban xã hội";
    }

    public void setBanHoc(Boolean banHoc) {
        this.banHoc = banHoc;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public List<MonThi> getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(List<MonThi> diemThi) {
        this.diemThi = diemThi;
    }

    public Double getDiemUuTien() {
        return diemUuTien;
    }

    public void setDiemUuTien(Double diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public Map<Integer, NguyenVong> getDanhSachNguyenVong() {
        return danhSachNguyenVong;
    }

    public void setDanhSachNguyenVong(Map<Integer, NguyenVong> danhSachNguyenVong) {
        this.danhSachNguyenVong = danhSachNguyenVong;
    }

    public Integer getDiemThiNangLuc() {
        return diemThiNangLuc;
    }

    public void setDiemThiNangLuc(Integer diemThiNangLuc) {
        this.diemThiNangLuc = diemThiNangLuc;
    }

    public String getDiaDiemThi() {
        return diaDiemThi;
    }

    public void setDiaDiemThi(String diaDiemThi) {
        this.diaDiemThi = diaDiemThi;
    }

    public ThiSinh timKiemThiSinhTheoSoBaoDanh(String MaThiSinh) {
        Set<String> keySet = MockData.danhSachThiSinh.keySet();

        for (String itemKey : keySet) {
            if (itemKey.equals(MaThiSinh)) {
                return MockData.danhSachThiSinh.get(itemKey);
            }
        }

        return null;
    }

    public void xuatThongTinThiSinh(ThiSinh entity) {
        System.out.println("\nThông tin của thí sinh " + entity.getHoTen() + " với mã số báo danh là " + entity.getSoBaoDanh() + ".");;
        System.out.println("Giới tính: " + entity.getGioiTinh());
        System.out.println("Sinh năm: " + entity.getNamSinh());
        System.out.println("Quê quán tại: " + entity.getQueQuan());
        System.out.println("Ban học: " + entity.getBanHoc());
        System.out.println("Địa điểm tiến hành thi cử: " + entity.diaDiemThi);

        System.out.println("\nĐiểm thi cử tổ hợp môn nhóm ban học " + entity.getBanHoc());
        for (MonThi item : entity.getDiemThi()) {
            System.out.println(item.getTenMon() + ": " + item.getDiemThi() + " điểm");
        }

        System.out.println("\nDanh sách nguyện vọng ");
        Set<Integer> keySet = entity.getDanhSachNguyenVong().keySet();
        for (Integer itemKey : keySet) {
            System.out.println("Nguyện vọng " + itemKey + ":" + entity.getDanhSachNguyenVong().get(itemKey).getMaNguyenVong() + ", điểm kì vọng: " + entity.getDanhSachNguyenVong().get(itemKey).getDiemChuan() + (itemKey * entity.getDanhSachNguyenVong().get(itemKey).getDiemBienThien()));
        }

        System.out.println("Điểm ưu tiên vùng miễn: " + entity.getDiemUuTien());
        System.out.println("Điểm thi đánh giá năng lực: " + entity.getDiemThiNangLuc());
        System.out.println("########################################################################################################################################################################################################################################################");
    }

    public void xuatThongTinThiSinhTrenCaNuoc() {
        System.out.println("\nThông tin của toàn bộ sĩ tử trên cả nước: ");
        for (String item : MockData.danhSachThiSinh.keySet()) {
            new ThiSinh().xuatThongTinThiSinh(MockData.danhSachThiSinh.get(item));
        }
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", gioiTinh=" + getGioiTinh() + ", namSinh=" + namSinh + ", queQuan=" + queQuan + ", diemThi=" + diemThi + ", diemUuTien=" + diemUuTien + ", danhSachNguyenVong=" + danhSachNguyenVong + ", diemThiNangLuc=" + diemThiNangLuc + ", diaDiemThi=" + diaDiemThi + ", banHoc=" + getBanHoc() + '}';
    }
}

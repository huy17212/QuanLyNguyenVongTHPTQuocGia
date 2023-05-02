/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock;

import entity.GiamThi;
import entity.MonThi;
import entity.NguyenVong;
import entity.ThiSinh;
import entity.ToHopMon;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Huy1721
 */
public class MockData {

    public static ArrayList<ToHopMon> danhSachToHopMon = new ArrayList<>();
    public static Map<String, ThiSinh> danhSachThiSinh = new LinkedHashMap<>();
    public static ArrayList<NguyenVong> danhSachNguyenVong = new ArrayList<>();
    public static Map<String, GiamThi> danhSachGiamThi = new LinkedHashMap<>();
    public static List<MonThi> danhsachMonThiBanTuNhien = new ArrayList();
    public static List<MonThi> danhsachMonThiBanXaHoi = new ArrayList();

    public static void mockupData() {
        MonThi toanHoc = new MonThi("Toán Học");
        MonThi vanHoc = new MonThi("Văn Học");
        MonThi anhVan = new MonThi("Anh Văn");
        MonThi vatLy = new MonThi("Vật Lý");
        MonThi hoaHoc = new MonThi("Hóa Học");
        MonThi sinhHoc = new MonThi("Sinh Học");
        danhsachMonThiBanTuNhien.addAll(Arrays.asList(vatLy, hoaHoc, sinhHoc));

        MonThi diaLy = new MonThi("Địa Lý");
        MonThi lichSu = new MonThi("Lịch Sử");
        MonThi GDCD = new MonThi("Giáo Dục Công Dân");
        danhsachMonThiBanTuNhien.addAll(Arrays.asList(diaLy, lichSu, GDCD));

        ToHopMon A00 = new ToHopMon("A00", "Toán-Lý-Hóa", Arrays.asList(toanHoc, vatLy, hoaHoc));
        ToHopMon A02 = new ToHopMon("A02", "Toán-Lý-Anh", Arrays.asList(toanHoc, vatLy, anhVan));
        ToHopMon A03 = new ToHopMon("A03", "Toán-Lý-Sinh", Arrays.asList(toanHoc, vatLy, sinhHoc));
        ToHopMon B00 = new ToHopMon("B00", "Toán-Hóa-Sinh", Arrays.asList(toanHoc, hoaHoc, sinhHoc));
        ToHopMon B08 = new ToHopMon("B08", "Toán-Sinh-Anh", Arrays.asList(toanHoc, sinhHoc, anhVan));
        ToHopMon C00 = new ToHopMon("C00", "Văn-Sử-Địa", Arrays.asList(vanHoc, lichSu, diaLy));
        ToHopMon C02 = new ToHopMon("C02", "Văn-Toán-Hóa", Arrays.asList(vanHoc, toanHoc, hoaHoc));
        ToHopMon C14 = new ToHopMon("C14", "Văn-Toán-GDCD", Arrays.asList(vanHoc, toanHoc, GDCD));
        ToHopMon D01 = new ToHopMon("D01", "Toán-Văn-Anh", Arrays.asList(toanHoc, vanHoc, anhVan));
        danhSachToHopMon.add(A00);
        danhSachToHopMon.add(A02);
        danhSachToHopMon.add(A03);
        danhSachToHopMon.add(B00);
        danhSachToHopMon.add(B08);
        danhSachToHopMon.add(C00);
        danhSachToHopMon.add(C02);
        danhSachToHopMon.add(C14);
        danhSachToHopMon.add(D01);

        NguyenVong NVDH101 = new NguyenVong("DH01_QTKD_A00", "Đại học 01 ngành quản trị kinh doanh", "DH01", 23.5, 550, A00, 0.75, Date.valueOf("2023-04-24"), 200);
        NguyenVong NVDH102 = new NguyenVong("DH01_QTKD_A02", "Đại học 01 ngành quản trị kinh doanh", "DH01", 23.75, 650, A02, 0.75, Date.valueOf("2023-04-24"), 100);
        NguyenVong NVDH103 = new NguyenVong("DH01_CNTT_A00", "Đại học 01 ngành công nghệ thông tin", "DH01", 26.5, 750, A00, 0.75, Date.valueOf("2023-04-26"), 200);
        NguyenVong NVDH104 = new NguyenVong("DH01_CNTT_A02", "Đại học 01 ngành công nghệ thông tin", "DH01", 27.5, 760, A02, 0.75, Date.valueOf("2023-04-22"), 300);
        NguyenVong NVDH201 = new NguyenVong("DH02_YDUOC_B00", "Đại học 02 ngành y dược", "DH02", 27.5, 750, B00, 0.1, Date.valueOf("2023-04-28"), 100);
        NguyenVong NVDH202 = new NguyenVong("DH02_YDUOC_A08", "Đại học 02 ngành y dược", "DH02", 28.5, 750, B08, 0.1, Date.valueOf("2023-04-28"), 50);
        NguyenVong NVDH203 = new NguyenVong("DH02_DDuong_B00", "Đại học 02 ngành diều dưỡng", "DH02", 25.5, 650, A03, 0.1, Date.valueOf("2023-05-01"), 100);
        NguyenVong NVDH301 = new NguyenVong("DH03_BCTT_C00", "Đại học 03 ngành báo chí truyền thông", "DH03", 24.5, 570, C00, 0.25, Date.valueOf("2023-06-24"), 100);
        NguyenVong NVDH302 = new NguyenVong("DH03_BCTT_C14", "Đại học 03 ngành báo chí truyền thông", "DH03", 22.5, 590, C14, 0.25, Date.valueOf("2023-07-24"), 200);
        NguyenVong NVDH401 = new NguyenVong("DH04_LGSTIC_C02", "Đại học 04 ngành Logistic", "DH04", 26.5, 630, C02, 0.5, Date.valueOf("2023-05-24"), 100);
        NguyenVong NVDH402 = new NguyenVong("DH04_LGSTIC_D01", "Đại học 04 ngành Logistic", "DH04", 24.5, 650, D01, 0.5, Date.valueOf("2023-05-24"), 100);
        danhSachNguyenVong.add(NVDH101);
        danhSachNguyenVong.add(NVDH102);
        danhSachNguyenVong.add(NVDH103);
        danhSachNguyenVong.add(NVDH104);
        danhSachNguyenVong.add(NVDH201);
        danhSachNguyenVong.add(NVDH202);
        danhSachNguyenVong.add(NVDH203);
        danhSachNguyenVong.add(NVDH301);
        danhSachNguyenVong.add(NVDH302);
        danhSachNguyenVong.add(NVDH401);
        danhSachNguyenVong.add(NVDH402);

        Map<Integer, NguyenVong> nguyenVongHHT = new LinkedHashMap<>();
        nguyenVongHHT.put(1, NVDH101);
        nguyenVongHHT.put(2, NVDH102);
        nguyenVongHHT.put(3, NVDH103);
        nguyenVongHHT.put(4, NVDH402);

        List<MonThi> diemThiHHT = Arrays.asList(
                new MonThi("Toán Học", 6.25),
                new MonThi("Văn Học", 7.0),
                new MonThi("Anh Văn", 9.25),
                new MonThi("Vật Lý", 7.5),
                new MonThi("Hóa Học", 4.25),
                new MonThi("Sinh Học", 5.5)
        );
        ThiSinh HHTri = new ThiSinh("PS24849", "Hà Huy Trí", true, 2003, "Hà Tĩnh", diemThiHHT, 0.0, nguyenVongHHT, 0, "TP.HCM", true);

        Map<Integer, NguyenVong> nguyenVongNTBC = new LinkedHashMap<>();
        nguyenVongNTBC.put(1, NVDH402);
        nguyenVongNTBC.put(2, NVDH401);
        nguyenVongNTBC.put(3, NVDH201);
        nguyenVongNTBC.put(4, NVDH104);
        nguyenVongNTBC.put(5, NVDH202);
        nguyenVongNTBC.put(6, NVDH203);
        List<MonThi> diemThiNTBC = Arrays.asList(
                new MonThi("Toán Học", 9.25),
                new MonThi("Văn Học", 8.0),
                new MonThi("Anh Văn", 7.8),
                new MonThi("Vật Lý", 8.5),
                new MonThi("Hóa Học", 7.25),
                new MonThi("Sinh Học", 6.5)
        );
        ThiSinh NTBCham = new ThiSinh("PS25252", "Nguyễn Trang Bảo Châm", false, 2003, "Quảng Nam", diemThiNTBC, 1.0, nguyenVongNTBC, 750, "Quảng Nam", true);

        Map<Integer, NguyenVong> nguyenVongNVA = new LinkedHashMap<>();
        nguyenVongNVA.put(1, NVDH301);
        nguyenVongNVA.put(2, NVDH302);
        nguyenVongNVA.put(3, NVDH402);

        List<MonThi> diemThiNVA = Arrays.asList(
                new MonThi("Toán Học", 9.25),
                new MonThi("Văn Học", 8.0),
                new MonThi("Anh Văn", 8.5),
                new MonThi("Địa Lý", 7.25),
                new MonThi("Lịch Sử", 6.5),
                new MonThi("GDCD", 8.5)
        );

        ThiSinh NVAnh = new ThiSinh("PS24848", "Nguyễn Vân Anh", false, 2003, "Hà Nội", diemThiNVA, 0.5, nguyenVongNVA, 620, "Hà Nội", false);
        danhSachThiSinh.put(HHTri.getSoBaoDanh(), HHTri);
        danhSachThiSinh.put(NTBCham.getSoBaoDanh(), NTBCham);
        danhSachThiSinh.put(NVAnh.getSoBaoDanh(), NVAnh);

        GiamThi NTAnh = new GiamThi("GT01", "Nguyễn Tuấn Anh", "Sở giáo dục TP.HCM", true, 1972, "Nam Định");
        GiamThi BVChau = new GiamThi("GT02", "Bùi Việt Châu", "Sở giáo dục TP.HCM", false, 1999, "TP.HCM");
        GiamThi TCThien = new GiamThi("GT03", "Trịnh Cái Thiên", "Sở giáo dục Bà Rịa Vũng Tàu", true, 1995, "Tiền Giang");
        GiamThi VHBao = new GiamThi("GT04", "Vũ Huyền Bảo", "Sở giáo dục TP.HCM", true, 1972, "TP.HCM");
        GiamThi CVCuong = new GiamThi("GT05", "Chu Việt Cường", "Sở giáo dục Hà Nội", true, 1882, "Hải Phòng");
        danhSachGiamThi.put(NTAnh.getMaGiamThi(), NTAnh);
        danhSachGiamThi.put(BVChau.getMaGiamThi(), BVChau);
        danhSachGiamThi.put(TCThien.getMaGiamThi(), TCThien);
        danhSachGiamThi.put(VHBao.getMaGiamThi(), VHBao);
        danhSachGiamThi.put(CVCuong.getMaGiamThi(), CVCuong);
    }

}

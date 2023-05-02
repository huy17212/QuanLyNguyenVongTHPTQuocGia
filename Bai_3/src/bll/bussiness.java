/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import entity.GiamThi;
import entity.MonThi;
import entity.NguyenVong;
import entity.ThiSinh;
import entity.ToHopMon;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import mock.MockData;
import utils.Constant;

/**
 *
 * @author Huy1721
 */
public class bussiness {

    public void function1() {
        try {
            System.out.print("Hãy nhập mã sinh viên bạn muốn chỉnh sửa: ");
            String maThiSinh = Constant.NHAP.nextLine();
            ThiSinh entity = new ThiSinh().timKiemThiSinhTheoSoBaoDanh(maThiSinh);
            if (entity != null) {
                System.out.print("Hãy nhập họ tên: ");
                String hoTen = Constant.NHAP.nextLine();
                System.out.print("Hãy nhập giới tính (nam = true, nữ = false): ");
                String gioiTinh = Constant.NHAP.nextLine();
                System.out.print("Hãy nhập năm sinh: ");
                String namSinh = Constant.NHAP.nextLine();
                System.out.print("Hãy nhập họ quê quán: ");
                String queQuan = Constant.NHAP.nextLine();
                System.out.print("Địa điểm thi cử: ");
                String diaDiem = Constant.NHAP.nextLine();
                System.out.print("Hãy nhập điểm ưu tiên (các tính miền bắc (0.5), miền trung (1), miền nam(0)): ");
                String diemUuTien = Constant.NHAP.nextLine();
                System.out.print("Điểm thi năng lực: ");
                String diemNangLuc = Constant.NHAP.nextLine();

                System.out.print("Hãy nhập ban học (ban tự nhiên = true, ban xã hội = false):");
                String banHoc = Constant.NHAP.nextLine();
                if (Boolean.parseBoolean(banHoc.toString())) {
                    Set<Integer> keySet = entity.getDanhSachNguyenVong().keySet();
                    for (Integer item : keySet) {
                        List<MonThi> MonThiNhamXetTuyen = entity.getDanhSachNguyenVong().get(item).getToHopMonDanhGia().getDanhSachMonThi();

                        if (MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanXaHoi.get(0))
                                || MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanXaHoi.get(1))
                                || MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanXaHoi.get(2))) {
                            System.out.println("\n\n!!!Cảnh báo ban học của bạn chứa tổ hợp môn bạn k học: " + entity.getDanhSachNguyenVong().get(item).getToHopMonDanhGia().getDanhSachMonThi());
                        }

                    }
                } else {
                    Set<Integer> keySet = entity.getDanhSachNguyenVong().keySet();
                    for (Integer item : keySet) {
                        List<MonThi> MonThiNhamXetTuyen = entity.getDanhSachNguyenVong().get(item).getToHopMonDanhGia().getDanhSachMonThi();

                        if (MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanTuNhien.get(0))
                                || MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanTuNhien.get(1))
                                || MonThiNhamXetTuyen.contains(MockData.danhsachMonThiBanTuNhien.get(2))) {
                            System.out.println("\n\n!!!Cảnh báo ban học của bạn chứa tổ hợp môn bạn k học: " + entity.getDanhSachNguyenVong().get(item).getToHopMonDanhGia().getDanhSachMonThi());
                            entity.getDanhSachNguyenVong().remove(item);
                        }

                    }
                }
                Set<String> keySet = MockData.danhSachThiSinh.keySet();
                for (String item : keySet) {
                    if (item.equals(maThiSinh)) {
                        ThiSinh entityk = new ThiSinh(maThiSinh, hoTen, Boolean.parseBoolean(gioiTinh),
                                Integer.parseInt(namSinh), queQuan, entity.getDiemThi(), Double.parseDouble(diemUuTien),
                                entity.getDanhSachNguyenVong(), Integer.parseInt(diemNangLuc), diaDiem, Boolean.parseBoolean(banHoc));
                        MockData.danhSachThiSinh.replace(item, entityk);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Lỗi xảy ra ở function 1");
        }
    }

    public void function2() {
        System.out.print("/nHãy nhập số báo danh của thí sinh: ");
        String maBaoDanh = Constant.NHAP.nextLine();

        for (String itemEntity : MockData.danhSachThiSinh.keySet()) {
            if (maBaoDanh.equals(itemEntity)) {
                modifier(itemEntity);
            }
        }
    }

    private void modifier(String itemEntityKey) {
        // xóa theo thứ tự
        // xóa hết
        // thêm mới theo mã nguyện vọng
        // cập nhật lại vị trí

        for (Integer itemNguyenVong : MockData.danhSachThiSinh.get(itemEntityKey).getDanhSachNguyenVong().keySet()) {
            System.out.println(MockData.danhSachThiSinh.get(itemEntityKey).getDanhSachNguyenVong().get(itemNguyenVong).toString(itemNguyenVong));
        }
        System.out.println("1. Thêm nguyện vọng vào cuối.");
        System.out.println("2. Điều chỉnh thứ tự nguyện vọng.");
        System.out.println("3. Xóa nguyện vọng");
        System.out.println("4. Xóa hết nguyện vọng");
        System.out.println("5. Thoát.");
        System.out.println("Nhập lựa chọn: ");
        String luachon = Constant.NHAP.nextLine();
        Boolean isRight = true;
        while (isRight) {
            switch (luachon) {
                case "1": {
                    System.out.print("\nHãy nhập mã số nguyện vọng: ");
                    new NguyenVong().themNguyenVong(Constant.NHAP.nextLine(), itemEntityKey);
                    break;
                }
                case "2": {
                    System.out.print("\nHãy nhập thứ tự nguyện vọng muốn thay đổi: ");
                    Integer thuTuNguyenVong = Integer.parseInt(Constant.NHAP.nextLine());
                    System.out.print("\nHãy nhập vị trí cần chuyển dời: ");
                    Integer viTriChuyenDoi = Integer.parseInt(Constant.NHAP.nextLine());
                    new NguyenVong().dieuChinhNguyenVong(thuTuNguyenVong, viTriChuyenDoi, itemEntityKey);
                    break;
                }
                case "3": {
                    System.out.print("\nHãy nhập vị trí nguyện vọng cần xóa: ");
                    new NguyenVong().xoaNguyenVong(Integer.parseInt(Constant.NHAP.nextLine()), itemEntityKey);
                    break;
                }
                case "4": {
                    new NguyenVong().xoaHetNguyenVong(itemEntityKey);
                    break;
                }
                case "5": {
                    isRight = false;
                    break;
                }
            }
        }
    }

    public void function3() {
        System.out.print("Hãy nhập mã sinh giám thị: ");
        String maGiamThi = Constant.NHAP.nextLine();
        GiamThi entity = new GiamThi().timKiemGiamThiTheoMaGiamThi(maGiamThi);
        if (entity != null) {
            System.out.print("Hãy nhập họ tên: ");
            String hoTen = Constant.NHAP.nextLine();
            System.out.print("Hãy nhập giới tính (nam = true, nữ = false): ");
            String gioiTinh = Constant.NHAP.nextLine();
            System.out.print("Hãy nhập năm sinh: ");
            String namSinh = Constant.NHAP.nextLine();
            System.out.print("Hãy nhập họ quê quán: ");
            String queQuan = Constant.NHAP.nextLine();
            System.out.print("Địa điểm công tác: ");
            String congTac = Constant.NHAP.nextLine();
            entity.setTenGiamThi(hoTen);
            entity.setGioiTinh(Boolean.parseBoolean(gioiTinh));
            entity.setNamSinh(Integer.parseInt(namSinh));
            entity.setQueQuan(queQuan);
            for (String item : MockData.danhSachGiamThi.keySet()) {
                if (MockData.danhSachGiamThi.get(item).getMaGiamThi().equals(maGiamThi)) {
                    MockData.danhSachGiamThi.replace(entity.getMaGiamThi(), entity);
                }
            }
        } else {
            System.out.println("Không tìm thấy mã giám thị này.");
        }
    }

    private String tenGiamThi;
    private String donViCongTac;
    private Boolean gioiTinh;
    private Integer namSinh;
    private String queQuan;

    public Double diemThi;
    NavigableMap<String, ThiSinh> customSortTrungTuyen;

    public void kiemTraTrungTuyen(Integer thuTuNguyenVong, ThiSinh thiSinh) {

        // lấy ra điểm biến thiên
        Double diemBienThien = thiSinh.getDanhSachNguyenVong().get(thuTuNguyenVong).getDiemChuan()
                + (thiSinh.getDanhSachNguyenVong().get(thuTuNguyenVong).getDiemBienThien() * thuTuNguyenVong);

        diemThi = 0.0;
        // cần lấy ra tổ hợp môn để tính điểm, so sánh với danh sách tổ hợp môn
        for (ToHopMon itemEntity : MockData.danhSachToHopMon) {
            if (itemEntity.getMaToHopMon().equals(thiSinh.getDanhSachNguyenVong().get(thuTuNguyenVong).getToHopMonDanhGia().getMaToHopMon())) {
                int index = 0;
                for (MonThi itemMonThi : itemEntity.getDanhSachMonThi()) {
                    if (thiSinh.getDiemThi().get(index).getTenMon().equals(itemMonThi.getTenMon())) {
                        diemThi += thiSinh.getDiemThi().get(index).getDiemThi();
                    }
                    index++;
                }
            }
        }
        diemThi += thiSinh.getDiemUuTien();
        if (diemThi > diemBienThien) {
            customSortTrungTuyen.put(thiSinh.getSoBaoDanh() + diemThi + "", thiSinh);
        }

    }

    public void function4() {
        // HIỂN THỊ DANH SÁCH TRÚNG TUYỂN THEO MÃ NGUYỆN VỌNG, THEO ĐIỂM, ASC or DESC.
        customSortTrungTuyen = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Double doub1 = Double.parseDouble(o1.substring(6, o1.length()));
                Double doub2 = Double.parseDouble(o2.substring(6, o1.length()));
                return doub1.compareTo(doub2);
            }
        });

        // tìm ra sinh viên có nguyện vọng như người dùng nhập, check nếu đậu nguyện vong sau đó add vào thằng comparator
        System.out.print("/nHãy nhập mã nguyện vọng: ");
        String maNguyenVong = Constant.NHAP.nextLine();

        System.out.print("/nHãy nhập mã thứ tự sắp xếp(DESC or ASC): ");
        String sortByCondition = Constant.NHAP.nextLine();

        for (String itemEntity : MockData.danhSachThiSinh.keySet()) {
            for (Integer thuTuNguyenVong : MockData.danhSachThiSinh.get(itemEntity).getDanhSachNguyenVong().keySet()) {
                if (MockData.danhSachThiSinh.get(itemEntity).getDanhSachNguyenVong().get(thuTuNguyenVong).getMaNguyenVong().equals(maNguyenVong)) {
                    kiemTraTrungTuyen(thuTuNguyenVong, MockData.danhSachThiSinh.get(itemEntity));
                }
            }
        }

        if (sortByCondition.equals("ASC")) {
            for (String keyEntity : customSortTrungTuyen.descendingKeySet()) {
                new ThiSinh().xuatThongTinThiSinh(customSortTrungTuyen.get(keyEntity));
            }
        } else if (sortByCondition.equals("DESC")) {
            for (String keyEntity : customSortTrungTuyen.keySet()) {
                new ThiSinh().xuatThongTinThiSinh(customSortTrungTuyen.get(keyEntity));
            }
        }
    }

    public void function5() {
        customSortTrungTuyen = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1);
                Integer doub1 = Integer.parseInt(o1.substring(6, o1.length()));
                Integer doub2 = Integer.parseInt(o2.substring(6, o1.length()));
                return doub1.compareTo(doub2);
            }
        });

        // tìm ra sinh viên có nguyện vọng như người dùng nhập, check nếu đậu nguyện vong sau đó add vào thằng comparator
        System.out.print("/nHãy nhập mã nguyện vọng: ");
        String maNguyenVong = Constant.NHAP.nextLine();

        System.out.print("/nHãy nhập mã thứ tự sắp xếp(DESC or ASC): ");
        String sortByCondition = Constant.NHAP.nextLine();

        for (String itemEntity : MockData.danhSachThiSinh.keySet()) {
            for (Integer thuTuNguyenVong : MockData.danhSachThiSinh.get(itemEntity).getDanhSachNguyenVong().keySet()) {
                if (MockData.danhSachThiSinh.get(itemEntity).getDiemThiNangLuc() >= MockData.danhSachThiSinh.get(itemEntity).getDanhSachNguyenVong().get(thuTuNguyenVong).getDiemDanhGiaNangLuc()) {
                    customSortTrungTuyen.put(MockData.danhSachThiSinh.get(itemEntity).getSoBaoDanh() + MockData.danhSachThiSinh.get(itemEntity).getDiemThiNangLuc() + "", MockData.danhSachThiSinh.get(itemEntity));
                }
            }
        }
        if (sortByCondition.equals("ASC")) {
            for (String keyEntity : customSortTrungTuyen.descendingKeySet()) {
                new ThiSinh().xuatThongTinThiSinh(customSortTrungTuyen.get(keyEntity));
            }
        } else if (sortByCondition.equals("DESC")) {
            for (String keyEntity : customSortTrungTuyen.keySet()) {
                new ThiSinh().xuatThongTinThiSinh(customSortTrungTuyen.get(keyEntity));
            }
        }
    }

    public void function6() {
        System.out.println("\nHãy nhập mã trường đại học: ");
        String maDaiHoc = Constant.NHAP.nextLine();

        for (NguyenVong itemEntity : MockData.danhSachNguyenVong) {
            if (itemEntity.getMaTruongDaiHoc().equals(maDaiHoc)) {
                new NguyenVong().xuatThongTinChuyenNganhDaiHoc(itemEntity);
            }
        }
    }

    public void function7() {
        new ThiSinh().xuatThongTinThiSinhTrenCaNuoc();
    }

    public void function8() {
        System.out.print("\nHãy nhập quê quán của giám thị: ");
        String queQuan = Constant.NHAP.nextLine();

        for (String itemEntity : MockData.danhSachGiamThi.keySet()) {
            if (MockData.danhSachGiamThi.get(itemEntity).getQueQuan().equals(queQuan)) {
                new GiamThi().xuatThongGiamThi(MockData.danhSachGiamThi.get(itemEntity));
            }
        }
    }

    public void function9() {
        System.out.print("Hãy nhập mã thí sinh bạn muốn xuất toàn bộ thông tin: ");
        new ThiSinh().xuatThongTinThiSinh(new ThiSinh().timKiemThiSinhTheoSoBaoDanh(Constant.NHAP.nextLine()));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import bll.bussiness;
import java.sql.Date;
import java.util.Scanner;
import mock.MockData;
import utils.Constant;

/**
 *
 * @author Huy1721
 */
public class main {
    //Xây dựng chương trình quản lý tuyển sinh đại học, gồm các đối tượng như mô tả bên dưới:
    //- Thí sinh: mỗi thí sinh có số báo danh, họ tên, giới tính, năm sinh, quê quán, điểm thi, điểm ưu tiên
    //- Nguyện vọng: một thí sinh có thể có nhiều nguyện vọng. Mỗi nguyện vọng bao gồm: mã ngành, tên ngành, mã trường, khối xét tuyển, điểm thi ứng với nguyện vọng sau kỳ thi.
    //- Giám thị: Các giám thị được phân công coi thi, gồm mã giám thị, đơn vị công tác, họ tên, giới tính, năm sinh, quê quán.
    //
    //Chương trình có các chức năng sau:
    //1. Chỉnh sửa thông tin thí sinh, nguyện vọng, giám thị
    //2. Hiển thị các thí sinh trúng tuyển theo tham số đầu vào gồm mã ngành và điểm chuẩn của ngành
    //3. Sắp xếp danh sách thí sinh trúng tuyển theo ngành (nhập từ bàn phím) và theo điểm giảm dần
    //4. Hiển thị giám thị có quê quán là TP HCM.

    //môn thi: String Tên môn, Double Diem thi.
    //tổ hợp môn thi: Mã tổ hợp môn, tên tổ hợp môn, danh sách 3 môn thi, khối tự nhiên hay xã hội.
    //nguyện vọng: Mã nguyện vọng, tên ngành nguyện vọng, mã trường, điểm chuẩn, diểm sàng đánh giá năng lực, tổ hợp môn thi, mức độ ưu tiên 1, 2, 3, ngày hạn chót nộp hồ sơ, số lượng
    //thí sinh: số báo danh, họ tên, giới tính, năm sinh, quê quán, List<MonThi>, diểm uư tiên, Map<NguyenVong>, điểm thi đánh giá năng lực, địa điểm thi
    // giám thị: mã giám thị, tên giám thị, đơn vị công tác, giới tính, năm sinh, quê quán
    public static void main(String[] args) {
        bussiness bll = new bussiness();
        MockData.mockupData();

        while (true) {
            System.out.println("\n");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH MADE BY HÀ HUY TRÍ.");
            System.out.println("I.    CHỈNH SỬA THÔNG TIN THÍ SINH.");
            System.out.println("II.   CHỈNH SỬA THÔNG TIN GIÁM THỊ.");
            System.out.println("III.  CHỈNH SỬA THÔNG TIN NGUYỆN VỌNG.");
            System.out.println("IV.   HIỂN THỊ DANH SÁCH TRÚNG TUYỂN THEO MÃ NGUYỆN VỌNG, THEO ĐIỂM, ASC or DESC.");
            System.out.println("V.    HIỂN THỊ DANH SÁCH TRÚNG TUYỂN THEO MÃ NGUYỆN VỌNG, THEO ĐIỂM NĂNG LỰC, ASC or DESC.");
            System.out.println("VI.   HIỂN THỊ TOÀN BỘ NGÀNH HỌC CỦA TRƯỜNG DH.");
            System.out.println("VII.  HIỂN THỊ TOÀN BỘ THÍ SINH CỦA CẢ NƯỚC.");
            System.out.println("VIII. HIỂN THỊ TOÀN BỘ GIÁM THỊ THEO QUÊ QUÁN.");
            System.out.println("IX.   HIỂN THỊ THÔNG TIN CỦA THÍ SINH THEO MÃ.");
            System.out.println("X.    Exit");
            System.out.println("*************************************************\n");
            System.out.print("nhập lựa chọn của bạn, tương ứng I -> X: ");
            Constant.LUA_CHON = Constant.NHAP.nextLine();
            switch (Constant.LUA_CHON) {
                case "I": {
                    bll.function1();
                    break;
                }
                case "II": {
                    bll.function2();
                    break;
                }
                case "III": {
                    bll.function3();
                    break;
                }
                case "IV": {
                    bll.function4();
                    break;
                }
                case "V": {
                    bll.function5();
                    break;
                }
                case "VI": {
                    bll.function6();
                    break;
                }
                case "VII": {
                    bll.function7();
                    break;
                }
                case "VIII": {
                    bll.function8();
                    break;
                }
                case "IX": {
                    bll.function9();
                    break;
                }
                case "X": {
                    System.out.println("\nFrom Hà Huy Trí with love, mãi mãi cống hiến cho đời!!");
                    System.exit(0);
                }
            }
            System.out.print("Nhập enter to confirm: ");
            String comfirm = Constant.NHAP.nextLine();
        }

    }

}

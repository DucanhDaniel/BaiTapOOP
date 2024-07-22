package Slide5.Bai2;
import Slide3.Bai3.NhanVien;
public class TinhTongLuong {
    static public double tinhTongLuong(NhanVien... mangNV) {
        double tongLuong = 0;
        for (NhanVien nv : mangNV) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("John Doe", 25, 1, 1e9);
        NhanVien nv2 = new NhanVien("Jane Doe", 30, 1.2, 1e9);
        NhanVien nv3 = new NhanVien("Tom Doe", 35, 1.5, 1e9);
        System.out.println("Tong luong cua cac nhan vien la: " + tinhTongLuong(nv1, nv2, nv3));
    }

}

package Slide5.Bai1;
import Slide3.Bai3.NhanVien;
public class TestStaticNhanVien {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nguyen Van A", 30, 5000000, 100000000);
        NhanVien nhanVien2 = new NhanVien("Le Van B", 25, 4500000, 1000000000);
        System.out.println("Tong so nhan vien: " + NhanVien.COUNT);
    }
}

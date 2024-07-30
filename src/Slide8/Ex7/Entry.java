package Slide8.Ex7;

public class Entry {
    public static void main(String[] args) {
        PhongBan phongBan = new PhongBan("Phong ban A");
        NhanVien nhanVien = new NhanVienHopDong("John Doe", 5000000);
        NhanVien nhanVien2 = new NhanVienCoHuu("Jane", 1.1);
        NhanVien nhanVien3 = new TruongPhong("Tom", 1.5, 1000000, 2);
        NhanVien nhanVien4 = new NhanVienHopDong("Alice", 6000000);
        phongBan.themNV(nhanVien);
        phongBan.themNV(nhanVien2);
        phongBan.themNV(nhanVien3);
        phongBan.themNV(nhanVien4);
        phongBan.inThongTin();


    }
}

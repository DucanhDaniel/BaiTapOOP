package Slide8.Ex7;

public class NhanVienCoHuu extends NhanVien {
    private static double luongCoBan = 1000000;
    private double heSoLuong;

    NhanVienCoHuu(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangHeSoLuong(double heSoTang) {
        if (heSoLuong + heSoTang <= 10) {
            heSoLuong += heSoTang;
            return true;
        }
        return false;
    }
    public void inThongTin() {
        System.out.println("Ten nhan vien co huu: " + super.getTenNhanVien());
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
    }
}

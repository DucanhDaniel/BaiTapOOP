package Slide7.Exercise2;

public class NhanVien {
    private String tenNhanVien;
    private static double luongCoBan = 1000000;
    private double heSoLuong;
    private static double LUONG_MAX = 20000000;
    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }
    public double getLuongMax() {
        return LUONG_MAX;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public boolean tangHeSoLuong(double heSoTangThem) {
        if ((heSoLuong + heSoTangThem)*luongCoBan <= LUONG_MAX) {
            heSoLuong += heSoTangThem;
            return true;
        }
        return false;
    }
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong tinh theo he so: " + tinhLuong());
        System.out.println("--------------------------------");
    }
}

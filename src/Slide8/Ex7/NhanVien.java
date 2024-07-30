package Slide8.Ex7;

abstract public class NhanVien {
    private String tenNhanVien;
    public static double LUONG_MAX = 1000000;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public boolean equals(NhanVien other) {
        return tenNhanVien.equals(other.getTenNhanVien());
    }
    abstract public double tinhLuong();
    abstract public void inThongTin();
}

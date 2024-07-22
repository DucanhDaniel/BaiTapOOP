package Slide3.Bai3;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;
    public NhanVien(){}
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = luongMax;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void setLUONG_MAX(double luongMax) {
        this.LUONG_MAX = luongMax;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    public boolean tangLuong(double heSoTangThem) {
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

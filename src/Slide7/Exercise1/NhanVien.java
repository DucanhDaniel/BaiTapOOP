package Slide7.Exercise1;

abstract class NhanVien {
    protected String tenNhanVien;
    public static double LUONG_CO_BAN = 750000;
    protected double heSoLuong = 20000000;
    private static double LUONG_MAX;
    public static int COUNT = 0;
    public NhanVien(){}
    public NhanVien(String tenNhanVien, double LUONG_CO_BAN, double heSoLuong, double luongMax) {
        this.tenNhanVien = tenNhanVien;
        this.LUONG_CO_BAN = LUONG_CO_BAN;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = luongMax;
        COUNT++;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public void setLUONG_CO_BAN(double LUONG_CO_BAN) {
        this.LUONG_CO_BAN = LUONG_CO_BAN;
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
    public double getLUONG_CO_BAN() {
        return LUONG_CO_BAN;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    public boolean tangLuong(double heSoTangThem) {
        if ((heSoLuong + heSoTangThem)*LUONG_CO_BAN <= LUONG_MAX) {
            heSoLuong += heSoTangThem;
            return true;
        }
        return false;
    }
    public double tinhLuong() {
        return LUONG_CO_BAN * heSoLuong;
    }
    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + LUONG_CO_BAN);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong tinh theo he so: " + tinhLuong());
        System.out.println("--------------------------------");
    }
}

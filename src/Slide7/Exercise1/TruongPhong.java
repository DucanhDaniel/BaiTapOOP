package Slide7.Exercise1;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;
    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax, double phuCap, double soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, luongMax);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
    public void setSoNamDuongChuc(double soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double getPhuCap() {
        return phuCap;
    }
    public double getSoNamDuongChuc() {
        return soNamDuongChuc;
    }
    public double tinhLuong() {
        return LUONG_CO_BAN*heSoLuong + phuCap;
    }
    @Override
    public void inTTin() {
        System.out.println("Ten truong phong: " + tenNhanVien);
        System.out.println("Luong co ban: " + LUONG_CO_BAN);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong tinh theo he so: " + tinhLuong());
        System.out.println("--------------------------------");
    }

}

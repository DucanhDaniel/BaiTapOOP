package Slide8.Ex7;

public class TruongPhong extends NhanVienCoHuu {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenTruongPhong, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenTruongPhong, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double tinhLuong() {
        return super.tinhLuong() + phuCap*soNamDuongChuc/10;
    }
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("So nam duong chuc: " + soNamDuongChuc);
    }
}

package Slide8.Ex7;

public class NhanVienHopDong extends NhanVien {
    private double luongHopDong;

    public NhanVienHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    public double tinhLuong() {
        return luongHopDong;
    }
    public void inThongTin() {
        System.out.println("NhanVien hop dong: " + getTenNhanVien());
        System.out.println("Luong hop dong: " + luongHopDong);
    }
}

package Slide8.Ex7;

public class PhongBan {
    private String tenPhongBan;
    private int soNhanVien;
    private NhanVien[] dsNhanVien = new NhanVien[SO_NV_MAX];
    public static int SO_NV_MAX = 100;

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
    }

    public boolean themNV(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            dsNhanVien[soNhanVien] = nv;
            soNhanVien++;
            return true;
        }
        else return false;
    }

    public NhanVien xoaNV() {
        if (soNhanVien == 0) {
            return null;
        }
        NhanVien result = dsNhanVien[soNhanVien - 1];
        dsNhanVien[soNhanVien - 1] = null;
        soNhanVien--;
        return result;
    }

    public double tinhTongLuong() {
        double result = 0;
        for (int i = 0; i < soNhanVien; i++) {
            result += dsNhanVien[i].tinhLuong();
        }
        return result;
    }

    public void inThongTin() {
        System.out.println("Thong tin nhan vien cua phong ban " + tenPhongBan + ": ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhan vien thu " + (i + 1) + ":");
            dsNhanVien[i].inThongTin();
            System.out.println("--------------------------------");
        }
        System.out.println("Tong luong cua phong ban " + tenPhongBan + " la: " + (int)tinhTongLuong());
    }
}

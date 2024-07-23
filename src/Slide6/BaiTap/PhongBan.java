package Slide6.BaiTap;
import Slide3.Bai3.NhanVien;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public static final byte SO_NV_MAX = 100;
    private NhanVien[] dsnv;
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        dsnv = new NhanVien[SO_NV_MAX];
        soNhanVien = 0;
    }
    public boolean themNhanVien(NhanVien nv){
        if (soNhanVien < SO_NV_MAX) {

            dsnv[soNhanVien] = nv; soNhanVien++;
            return true;
        }
        else return false;
    }
    public NhanVien xoaNhanVien(){
        if (soNhanVien > 0) {
            NhanVien tmp = dsnv[soNhanVien-1];
            dsnv[soNhanVien-1] = null;
            soNhanVien--;
            return tmp;
        }
        else return null;
    }
    public double tongLuong() {
        double res = 0;
        for (NhanVien nv : dsnv) {
            res += nv.tinhLuong();
        }
        return res;
    }
    public void inTTin() {
        System.out.println("Ten phong: " + tenPhongBan);
        System.out.println("So NV: " + soNhanVien);
        System.out.println("Thong tin cac NV");
        for (int i = 0; i < soNhanVien; i++)
            dsnv[i].inTTin();
    }
}

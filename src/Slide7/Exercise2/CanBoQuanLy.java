package Slide7.Exercise2;

public class CanBoQuanLy extends NhanVien implements QuanLy {
    public static double loiNhuanCongTy = 100000000;

    public CanBoQuanLy(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien, heSoLuong);
    }
    @Override
    public double tinhHoaHong() {
        return 0.2*loiNhuanCongTy/100;
    }

    @Override
    public double tinhLuong() {
        return super.getLuongCoBan()*super.getHeSoLuong() + tinhHoaHong();
    }

    @Override
    public void inTTin() {
        System.out.println("Ten can bo quan ly: " + super.getTenNhanVien());
        System.out.println("Luong co ban: " + super.getLuongCoBan());
        System.out.println("He so luong: " + super.getHeSoLuong());
        System.out.println("Hoa hong: " + tinhHoaHong());
        System.out.println("Luong can bo quan ly: " + tinhLuong());
        System.out.println("--------------------------------");
    }

}


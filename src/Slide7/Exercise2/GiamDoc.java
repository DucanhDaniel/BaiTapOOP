package Slide7.Exercise2;

public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    public static double loiNhuanCongTy = 100000000;

    public GiamDoc(String tenNhanVien, double heSoLuong, double phuCap) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }
    @Override
    public double tinhHoaHong() {
        return 5*loiNhuanCongTy/100;
    }

    @Override
    public double tinhLuong() {
        return super.getLuongCoBan()*super.getHeSoLuong() + phuCap + tinhHoaHong();
    }

    @Override
    public void inTTin() {
        System.out.println("Ten nhan vien: " + super.getTenNhanVien());
        System.out.println("Luong co ban: " + super.getLuongCoBan());
        System.out.println("He so luong: " + super.getHeSoLuong());
        System.out.println("Hoa hong: " + tinhHoaHong());
        System.out.println("Phu cap: " + phuCap);
        System.out.println("Luong giam doc: " + tinhLuong());
        System.out.println("--------------------------------");
    }

}

package Slide10.CreateException;

public class TaiKhoan{
    private double soDu;

    public TaiKhoan(double soDu) {
        this.soDu = soDu;
    }
    public void rutTien(double soTien) throws SoDuKhongDuException, SoTienRutAmException {
        if (soTien > soDu) {
            throw new SoDuKhongDuException("So du khong du!");
        }
        if (soTien < 0) {
            throw new SoTienRutAmException("So tien rut am!");
        }
        soDu = soDu - soTien;
    }
    public double getSoDu() {
        return soDu;
    }
}

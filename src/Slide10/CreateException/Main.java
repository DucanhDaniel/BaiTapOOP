package Slide10.CreateException;

public class Main {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan(1000);
        try {
            taiKhoan.rutTien(-2000);
            System.out.println("Rut tien thanh cong");
            System.out.println("So du: " + taiKhoan.getSoDu());
        } catch (SoDuKhongDuException | SoTienRutAmException e) {
            System.out.println("Rut tien that bai: " + e.getMessage());
        }

    }
}

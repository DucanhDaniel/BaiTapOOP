package Slide4.Bai2;

import Slide3.Bai3.NhanVien;

public class TestNV {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nhan vien 1", 100000, 1, 1000000);
        NhanVien nv2 = new NhanVien("Nhan vien 2", 150000, 2, 1500000);
        System.out.println("Thuc hien tang luong cho nhan vien 1, tang he so luong them 0.5:");
        if (nv1.tangLuong(0.5)) {
            System.out.println("Tang luong thanh cong!");
            System.out.println("Luong cua nhan vien 1 sau khi tang: " + nv1.tinhLuong());
        }
        else System.out.println("Tang luong that bai! Can chon he so tang nho hon!");
        System.out.println("--------------------------------");
        System.out.println("Thuc hien tang luong cho nhan vien 2, tang he so luong them 12:");
        if (nv2.tangLuong(12)) {
            System.out.println("Tang luong thanh cong!");
            System.out.println("Luong cua nhan vien 2 sau khi tang: " + nv2.tinhLuong());
        }
        else System.out.println("Tang luong that bai! Can chon he so tang nho hon!");
        System.out.println("--------------------------------");

        System.out.println("In thong tin nhan vien 1:");
        nv1.inTTin();
        System.out.println("In thong tin nhan vien 2:");
        nv2.inTTin();

    }
}

package main;

import Slide72.SinhVien;

public class App72 {
  public static void main(String[] args) {
    SinhVien sinhvien1 = new SinhVien();
    SinhVien sinhvien2 = new SinhVien();

    sinhvien1.setTen("");
    sinhvien1.setTuoi(23);

    sinhvien2.setTen("Peter");
    sinhvien2.setTuoi(17);

    System.out.println("Sinh vien 1 co ten :" + sinhvien1.getTen() + ", tuoi : " + sinhvien1.getTuoi());
    System.out.println("Sinh vien 2 co ten :" + sinhvien1.getTen() + ", tuoi : " + sinhvien2.getTuoi());
  }
}

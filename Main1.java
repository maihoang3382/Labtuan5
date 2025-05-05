package Labtuan5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hinh[] danhSach;
        System.out.print("Nhập số lượng hình: ");
        int n = Integer.parseInt(sc.nextLine());
        danhSach = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nChọn loại hình thứ " + (i + 1));
            System.out.println("1. Hình Vuông");
            System.out.println("2. Hình Chữ Nhật");
            System.out.println("3. Hình Tròn");
            System.out.print("Lựa chọn: ");
            int loai = Integer.parseInt(sc.nextLine());
            switch (loai) {
                case 1:
                    danhSach[i] = new HinhVuong();
                    break;
                case 2:
                    danhSach[i] = new HinhChuNhat();
                    break;
                case 3:
                    danhSach[i] = new HinhTron();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Gán mặc định là hình vuông.");
                    danhSach[i] = new HinhVuong();
            }

            danhSach[i].nhap();
        }

        System.out.println("\nTHÔNG TIN CÁC HÌNH");
        for (Hinh h : danhSach) {
            h.xuat();
        }
        sc.close();
    }
}

package Labtuan5;

import java.util.Scanner;

public class HinhVuong implements Hinh {
    private float canh;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh hình vuông: ");
        canh = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("Hình Vuông:");
        System.out.println("Cạnh = " + canh);
        System.out.println("Diện tích = " + dienTich());
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }
}

package Labtuan5;
import java.util.Scanner;
public class HinhTron implements Hinh {
    private float banKinh;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        banKinh = Float.parseFloat(sc.nextLine());
    }
    @Override
    public void xuat() {
        System.out.println("Hình Tròn:");
        System.out.println("Bán kính = " + banKinh);
        System.out.println("Diện tích = " + dienTich());
    }
    @Override
    public float dienTich() {
        return pi * banKinh * banKinh;
    }
}


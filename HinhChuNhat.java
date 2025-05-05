package Labtuan5;
import java.util.Scanner;
public class HinhChuNhat implements Hinh {
    private float dai, rong;
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        dai = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        rong = Float.parseFloat(sc.nextLine());
    }
    @Override
    public void xuat() {
        System.out.println("Hình Chữ Nhật:");
        System.out.println("Dài = " + dai + ", Rộng = " + rong);
        System.out.println("Diện tích = " + dienTich());
    }
    @Override
    public float dienTich() {
        return dai * rong;
    }
}

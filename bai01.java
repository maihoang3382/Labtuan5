package Labtuan5;
import java.util.ArrayList;
import java.util.Scanner;
abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;
    public void nhap(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        tenNhanVien = sc.nextLine();
        System.out.print("Nhập trình độ: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = Double.parseDouble(sc.nextLine());
    }
    public void xuat() {
        System.out.println("Mã NV: " + maNhanVien);
        System.out.println("Tên NV: " + tenNhanVien);
        System.out.println("Trình độ: " + trinhDo);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Lương thực nhận: " + tinhLuong());
    }
    public abstract double tinhLuong();
}
class QuanLy extends NhanVien {
    protected String chuyenMon;
    protected double phuCapChucVu;
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhập chuyên môn: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhập phụ cấp chức vụ: ");
        phuCapChucVu = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " + chuyenMon);
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }
}
class NghienCuu extends QuanLy {
    private double phuCapDocHai;
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhập phụ cấp độc hại: ");
        phuCapDocHai = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Phụ cấp độc hại: " + phuCapDocHai);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
}
class PhucVu extends NhanVien {
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> danhSach = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\nChọn loại nhân viên thứ " + (i + 1));
            System.out.println("1. Quản lý");
            System.out.println("2. Nghiên cứu");
            System.out.println("3. Phục vụ");
            System.out.print("Lựa chọn: ");
            int loai = Integer.parseInt(sc.nextLine());
            NhanVien nv = null;
            switch (loai) {
                case 1:
                    nv = new QuanLy();
                    break;
                case 2:
                    nv = new NghienCuu();
                    break;
                case 3:
                    nv = new PhucVu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Bỏ qua nhân viên này.");
                    continue;
            }
            System.out.println("Nhập thông tin nhân viên");
            nv.nhap(sc);
            danhSach.add(nv);
        }
        System.out.println("\nDANH SÁCH NHÂN VIÊN");
        for (NhanVien nv : danhSach) {
            nv.xuat();
            System.out.println();
        }
        sc.close();
    }
}

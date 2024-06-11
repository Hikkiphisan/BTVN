import java.util.Scanner;

public class QuanLySinhVien {
    private SinhVien[] danhSachSV;
    private int soLuongSV;
    private Scanner scanner;

    public QuanLySinhVien(int size) {
        danhSachSV = new SinhVien[size];
        soLuongSV = 0;
        scanner = new Scanner(System.in);
    }

    public void themSinhVien(SinhVien sv) {
        if (soLuongSV < danhSachSV.length) {
            danhSachSV[soLuongSV] = sv;
            soLuongSV++;
        } else {
            System.out.println("Danh sách đã đầy!");
        }
    }

    public void nhapSinhVien() {
        if (soLuongSV >= danhSachSV.length) {
            System.out.println("Danh sách đã đầy. Không thể thêm mới!");
            return;
        }

        System.out.println("Nhập mã sinh viên:");
        String maSV = scanner.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String tenSV = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên:");
        int tuoi = Integer.parseInt(scanner.nextLine());
        SinhVien sv = new SinhVien(maSV);
        themSinhVien(sv);
        System.out.println("Đã thêm sinh viên mới.");
    }

    public void hienthiDanhSachSV() {
        for (int i = 0; i < soLuongSV; i++) {
            System.out.println(danhSachSV[i]);
        }
    }
    public void suaSinhVien(String maSV, SinhVien svMoi) {
        for (int i = 0; i < soLuongSV; i++) {
            if (danhSachSV[i].getMaSV().equals(maSV)) {
                danhSachSV[i] = svMoi;
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + maSV);
    }

    public void xoaSinhVienbyID(String maSV) {
        for (int i = 0; i < soLuongSV; i++) {
            if (danhSachSV[i].getMaSV().equals(maSV)) {
                for (int j = i; j < soLuongSV - 1; j++) {
                    danhSachSV[j] = danhSachSV[j + 1];
                }
                soLuongSV--;
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + maSV);
    }
}

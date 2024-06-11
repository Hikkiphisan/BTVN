import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien(10);  // Khởi tạo danh sách có thể chứa tối đa 10 sinh viên

        while (true) {
            System.out.println("App Quản Lý Sinh Viên: " +
                    "Nhấn (1) Thêm sinh viên, " +
                    "Nhấn (2) Xem danh sách, " +
                    "Nhấn (3) Sửa sinh viên, " +
                    "Nhấn (2) Xoá sinh viên, " +
                    "Nhấn (0) Thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    qlsv.nhapSinhVien();
                    break;
                case 2:
                    qlsv.hienthiDanhSachSV();
                    break;
                case 3:
                    System.out.println("Nhập mã SV:");
                    String maSV = scanner.nextLine();
                    System.out.println("Nhập tên sinh viên mới:");
                    String tenSV = scanner.nextLine();
                    System.out.println("Nhập tuổi sinh viên mới:");
                    int tuoi = Integer.parseInt(scanner.nextLine());
                    SinhVien svMoi = new SinhVien(maSV, tenSV, tuoi);
                    qlsv.suaSinhVien(maSV, svMoi);
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên: ");
                    maSV = scanner.nextLine();
                    qlsv.xoaSinhVienbyID(maSV);
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}

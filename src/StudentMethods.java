import java.util.Scanner;

public class StudentMethods {
    //Phương thức tạo Học sinh
    public Student CreateStudent(Scanner scanner, int id) {
        System.out.println("Mời nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Mời nhập điểm:");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập lớp:");
        String classroom = scanner.nextLine();
        return new Student(id, name, age, address, point, classroom);
    }
     //Phương thức hiện Menu
    public void ShowMenu() {
        System.out.println("----------MENU-----------");
        System.out.println("1. Xem danh sách học sinh");
        System.out.println("2. Thêm học sinh mới");
        System.out.println("3. Cập nhật điểm học sinh");
        System.out.println("4. Xoá học sinh");
        System.out.println("5. Xem danh sách học sinh theo lớp");
        System.out.println("6. Sắp xếp theo tên");
        System.out.println("7. Sắp xếp theo tuổi");
        System.out.println("8. Sắp xếp theo điểm");
    }

}

import java.util.Scanner;

public class StudentMethods {
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


}

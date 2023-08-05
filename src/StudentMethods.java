import java.util.Scanner;

public class StudentMethods {
    //Phương thức tạo Học sinh
    public Student createStudent(Scanner scanner, int id) {
        System.out.println("Mời nhập tên:");
        String name = scanner.nextLine();
        do {
            System.out.println("Mời nhập tuổi:");
            int age = Integer.parseInt(scanner.nextLine());
            if (age <= 0) {
                System.out.println("Tuổi không hợp lệ, mời nhập lại!");
                continue;
            }
            System.out.println("Mời nhập địa chỉ:");
            String address = scanner.nextLine();
            do {
                System.out.println("Mời nhập điểm:");
                double point = Double.parseDouble(scanner.nextLine());
                if (point <= 0 || point > 10) {
                    System.out.println("Điểm không hợp lệ, mời nhập lại!");
                    continue;
                }
                System.out.println("Mời nhập lớp:");
                String classroom = scanner.nextLine();
                return new Student(id, name, age, address, point, classroom);
            }
            while (true);
        }
        while (true);

    }

     //Phương thức hiện Menu
    public void showMenu() {
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

    //Phương thức hiển thị danh sách học sinh
    public void showStudent(Student[] arr) {
        System.out.println("Danh sách học sinh:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].show());
        }
    }

    //Phương thức thêm mới học sinh
    public void addNewStudent(Student[] arrBefore, Student[] arrAfter) {
        for (int i = 0; i < arrBefore.length; i++) {
            arrAfter[i] = arrBefore[i];
        }
    }

    //Phương thức cập nhật điểm học sinh
    public void updatePointStudent(Scanner scanner, Student[] arr) {
        System.out.println("Chọn học sinh muốn cập nhật điểm:");
        int indexUpdatePoint = Integer.parseInt(scanner.nextLine());
        do {
            if (indexUpdatePoint <= 0 || indexUpdatePoint > arr.length) {
                System.out.println("Chọn sai thứ tự học sinh, mời nhập lại!");
                continue;
            }
            do {
                System.out.println("Nhập điểm mới: ");
                double newPoint = Double.parseDouble(scanner.nextLine());
                if (newPoint <= 0 || newPoint > 10) {
                    System.out.println("Điểm không hợp lệ, mời nhập lại!");
                    continue;
                }
                arr[indexUpdatePoint - 1].setPoint(newPoint);
                break;
            }
            while (true);
            break;
        }
        while (true);
    }

    //Phương thức xoá học sinh
    public void deleteStudent(Scanner scanner, Student[] arr, Student[] arrDeleted) {
        System.out.println("Chọn thứ tự học sinh muốn xoá:");
        int indexDelete = Integer.parseInt(scanner.nextLine());
        do {
            if (indexDelete <= 0 || indexDelete > arr.length) {
                System.out.println("Không hợp lệ, mời nhập lại");
                continue;
            }
            for (int i = 0; i < indexDelete - 1; i++) {
                arrDeleted[i] = arr[i];
            }
            for (int i = indexDelete - 1; i < arrDeleted.length; i++) {
                arrDeleted[i] = arr[i + 1];
            }
            break;
        }
        while (true);
    }

    //Phương thức xem học sinh theo lớp
    public void showStudentbyClassroom(Scanner scanner, Student[] arr) {
        System.out.println("Nhập lớp cần xem danh sách:");
        String inputClassroom = scanner.nextLine();
        System.out.println("-------Danh sách học sinh của lớp " + inputClassroom + "----------");
        for (int i = 0; i < arr.length; i++) {
            if (inputClassroom.equalsIgnoreCase(arr[i].getClassroom())) {
                System.out.println(arr[i].show());
            }
            else System.out.println("Không có học sinh nào của lớp " + inputClassroom);
        }
    }

    //Phương thức sắp xếp học sinh theo tuổi
    public void sortAscendingByAge(Student[] arr) {   //Sắp xếp tăng dần
        Student tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].getAge() > arr[j].getAge()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public void sortDescendingByAge(Student[] arr) {   //Sắp xếp giảm dần
        Student tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].getAge() < arr[j].getAge()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    //Phương thức sắp xếp học sinh theo điểm
    public void sortAscendingByPoint(Student[] arr) {   //Sắp xếp tăng dần
        Student tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].getPoint() > arr[j].getPoint()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public void sortDescendingByPoint(Student[] arr) {   //Sắp xếp giảm dần
        Student tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].getPoint() < arr[j].getPoint()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

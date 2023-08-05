import entities.Student;
import service.StudentMethods;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentMethods ultilities = new StudentMethods();
        int countId = Student.getId(); //tạo biến count để set ID tăng dần
        do {
            //Nhập số học sinh + tạo mảng chứa học sinh
            System.out.println("Mời nhập số học sinh:");
            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Không hợp lệ, mời nhập lại!");
                continue;
            }

            Student[] arrStudent = new Student[n];  //Tạo mảng lưu danh sách các học sinh

            for (int i = 0; i < arrStudent.length; i++) {
                System.out.println("----------SINH VIÊN THỨ " + (i + 1) + "----------");
                arrStudent[i] = ultilities.createStudent(scanner, countId);  //Tạo học sinh và gán vào phần từ mảng
                countId++;  //Sau khi tạo và gán Học sinh vào mảng, count tăng 1 cho id
            }

            //////Chọn các chức năng từ Menu chức năng
            do {
                ultilities.showMenu();
                int choose = Integer.parseInt(scanner.nextLine());
                ultilities.selectMenu(scanner, countId, choose, ultilities, arrStudent);
                System.out.println("-------- Continues? (Y/N)");
                String continues = scanner.nextLine();
                if (continues.equalsIgnoreCase("Y")) {
                    continue;
                }
                break;
            }
            while (true);
            /*switch (choose) {

                //Xem danh sách học sinh
                case 1 -> ultilities.showStudent(arrStudent);

                //Thêm học sinh mới
                case 2 -> {
                    //Tạo mảng mới có thêm học sinh
                    Student[] arrStudentAfterAdded = new Student[arrStudent.length + 1];
                    //Gán mảng cũ vào mảng mới
                    ultilities.addNewStudent(arrStudent, arrStudentAfterAdded);
                    //Tạo ra học sinh mới và gán vào phần tử cuối cùng của mảng mới
                    arrStudentAfterAdded[arrStudent.length] = ultilities.createStudent(scanner, countId);
                    //Hiển thị
                    ultilities.showStudent(arrStudentAfterAdded);
                }

                //Cập nhật điểm học sinh
                case 3 -> {
                    ultilities.showStudent(arrStudent);

                    ultilities.updatePointStudent(scanner, arrStudent);

                    System.out.println("--------Sau khi cập nhật----------");
                    ultilities.showStudent(arrStudent);
                }

                //Xoá học sinh
                case 4 -> {
                    ultilities.showStudent(arrStudent);
                    //Tạo mảng mới đã xoá học sinh
                    Student[] arrStudentAfterDeleted = new Student[arrStudent.length - 1];

                    ultilities.deleteStudent(scanner, arrStudent, arrStudentAfterDeleted);

                    System.out.println("--------Sau khi đã xoá----------");
                    ultilities.showStudent(arrStudentAfterDeleted);
                }

                //Xem danh sách học sinh theo lớp
                case 5 -> {
                    ultilities.showStudent(arrStudent);
                    ultilities.showStudentbyClassroom(scanner, arrStudent);
                }

                //Sắp xếp theo tên
                case 6 -> {
                    System.out.println("------Sắp xếp theo tên--------");
                    Arrays.sort(arrStudent, Comparator.comparing(Student::getName));
                    ultilities.showStudent(arrStudent);
                }

                //Sắp xếp theo tuổi
                case 7 -> {
                    System.out.println("Sắp xếp tăng dần theo tuổi");
                    ultilities.sortAscendingByAge(arrStudent);
                    ultilities.showStudent(arrStudent);

                    System.out.println("Sắp xếp giảm dần theo tuổi");
                    ultilities.sortDescendingByAge(arrStudent);
                    ultilities.showStudent(arrStudent);
                }

                //Sắp xếp theo điểm
                case 8 -> {
                    System.out.println("Sắp xếp tăng dần theo điểm");
                    ultilities.sortAscendingByPoint(arrStudent);
                    ultilities.showStudent(arrStudent);

                    System.out.println("Sắp xếp giảm dần theo điểm");
                    ultilities.sortDescendingByPoint(arrStudent);
                    ultilities.showStudent(arrStudent);
                }
            }*/
            break;
        }
        while (true);

        }
    }

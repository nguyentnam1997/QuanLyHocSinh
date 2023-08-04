import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                StudentMethods s = new StudentMethods();
                arrStudent[i] = s.CreateStudent(scanner, countId);
                countId++;  //Sau khi tạo và gán Học sinh vào mảng, count tăng 1 cho id
            }
            //////Menu các chứng năng
            for (int i = 0; i < arrStudent.length; i++) {
                System.out.println(arrStudent[i].Show());
            }

            break;
        }
        while (true);

        }
    }

package test;
import service.management.StudentManagement;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int OPTION_EXIT = -1;
        Scanner sc = new Scanner(System.in);
        Integer option;
        do{
            System.out.println("=======Menu Option========");
            System.out.println("=======1. Add student========");
            System.out.println("=======2. Search student With ID========");
            System.out.println("=======3. Update student with ID ========");
            System.out.println("=======4. Delete student with ID========");
            System.out.println("=======5. DisplayPercentAcademicAbility========");
            System.out.println("=======6. DisplayPercentGPAAverage========");
            System.out.println("=======7. ShowListStudentAcademicAbility========");
            System.out.println("=======8. ShowListStudent========");
            System.out.println("======= -1. Exit========");
            System.out.print("Enter option: ");
            while (true) {
                try {
                    option  = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a number: ");
                }
            }
            switch (option) {
                case 1 -> {
                    // 1. Thêm sinh viên
                    System.out.println("Option 1: ");
                    StudentManagement.add();
                }
                case 2 -> {
                    // 2. Tìm kiếm sinh viên
                    System.out.println("Option 2: ");
                    StudentManagement.search();
                }
                case 3 -> {
                    // 3. Sửa sinh viên
                    System.out.println("Option 3: ");
                    StudentManagement.update();
                }
                case 4 -> {
                    // 4. Xóa sinh viên
                    System.out.println("Option 4: ");
                    StudentManagement.delete();
                }
                case 5 -> {
                    // 5. Hiển thị phần trăm học lực
                    System.out.println("Option 5: ");
                    StudentManagement.displayPercentAcademicAbility();
                }
                case 6 -> {
                    // 6. Hiển thị phần trăm của các điểm
                    System.out.println("Option 6: ");
                    StudentManagement.displayPercentMarkAverage();
                }
                case 7 -> {
                    // 7. Hiển thị sinh viên theo khoảng Học lực
                    System.out.println("Option 7: ");
                    StudentManagement.showListStudentAcademicAbility();
                }
                case 8 -> {
                    // 8. Tính điểm trung bình của lớp
                    System.out.println("Option 8: ");
                    StudentManagement.showListStudent();
                }
                default -> {
                    if (option == -1) return;

                    else throw new IllegalArgumentException("Option unexpected");
                }
            }

        }while(option != OPTION_EXIT);
        StudentManagement.writeFile();
    }
}
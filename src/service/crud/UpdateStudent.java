package service.crud;

import model.Student;
import service.handle.Input;

import java.util.List;
import java.util.Scanner;

public class UpdateStudent {
    private static final Scanner sc = new Scanner(System.in);

    public static void withID(List<Student> studentList) {
        System.out.print("Enter ID want to update: ");
        int searchIDUpdate = Integer.parseInt(sc.nextLine());
        int checkUpdate = 0;
        for (Student student : studentList) {
            if (student.getId().equals(searchIDUpdate)) {
                checkUpdate = 1;
                Input.informationStudent(student);
            }
        }
        if (checkUpdate == 0) System.err.println("ID update is not exist!");
    }
}

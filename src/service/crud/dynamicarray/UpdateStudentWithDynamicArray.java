package service.crud.dynamicarray;

import model.Student;
import service.handle.Input;

import java.util.List;

public class UpdateStudentWithDynamicArray {
    public static void withID(List<Student> studentList, int searchIDUpdate) {
        int checkUpdate = 0;
        for (Student student : studentList) {
            if (student.getId().equals(searchIDUpdate)) {
                System.out.println("Updating.....");
                checkUpdate = 1;
                Input.informationStudent(student);
                System.out.println("Update Success");
            }
        }
        if (checkUpdate == 0) System.err.println("ID update is not exist!");
    }
}

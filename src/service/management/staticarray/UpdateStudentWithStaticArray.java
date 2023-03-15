package service.management.staticarray;

import model.Student;
import service.handle.Input;

public class UpdateStudentWithStaticArray {
    public static void withID(Student[] students,int searchIDUpdate) {

        int check = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(searchIDUpdate)) {
                check = i;
                System.out.println("Updating.....");
                Input.informationStudent(students[i]);
                System.out.println("Update Success");
                break;
            }
        }
        if(check == -1) System.err.println("ID update is not exist!");
    }
}

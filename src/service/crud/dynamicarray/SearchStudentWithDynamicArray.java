package service.crud.dynamicarray;

import model.Student;

import java.util.List;
public class SearchStudentWithDynamicArray {
    public static void withID(List<Student> studentList, int searchID) {
        int check = 0;
        for (Student student : studentList) {
            if (student.getId().equals(searchID)) {
                check = 1;
                System.out.println("model.Student need to search is: ");
                System.out.println(student);
                break;
            }
        }
        if (check == 0) System.err.println("No found, no matching data");
    }
}

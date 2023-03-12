package service.crud;

import model.Student;
import service.handle.SortListStudent;

import java.util.*;

public class DeleteStudent {
    private final static Scanner sc = new Scanner(System.in);
    public static void withID(List<Student> studentList){
        System.out.print("Enter ID want to delete: ");
        int searchIdDelete = Integer.parseInt(sc.nextLine());
        int checkDelete = 0;
        for (Student student : studentList) {
            if (student.getId().equals(searchIdDelete)) {
                checkDelete = 1;
                studentList.remove(student);
                System.out.println("Delete success!");
                break;
            }
        }
        if (checkDelete == 0)System.out.println("ID delete is not exist!");
        else {
            SortListStudent.withID(studentList);
        }
    }

}

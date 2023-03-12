package service.crud;

import model.Student;

import java.util.*;

public class SearchStudent {
    private static final Scanner sc = new Scanner(System.in);
    public static void withID(List<Student> studentList) {
        System.out.print("Enter ID want to search: ");
        int searchID = Integer.parseInt(sc.nextLine());
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

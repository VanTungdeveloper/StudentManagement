package service.crud.staticarray;

import model.Student;

public class SearchStudentWithStaticArray {

    public static void withID(Student[] students, int searchID) {

        int check = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(searchID)) {
                check = i;
                System.out.println("Student need to search is: ");
                System.out.println(students[i]);
                break;
            }
        }
        if(check == -1)  System.err.println("No found, no matching data");
    }
}

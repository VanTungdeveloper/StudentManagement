package service.management.staticarray;

import model.Student;

public class DeleteStudentWithStaticArray {
    public static void withID(Student[] students, int searchIdDelete){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == searchIdDelete) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            students[students.length - 1] = null;
            System.out.println("Delete Success!");
        }else{
            System.out.println("ID Delete is no exist");
        }
    }

}

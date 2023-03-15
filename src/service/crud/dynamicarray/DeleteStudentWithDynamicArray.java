package service.crud.dynamicarray;

import model.Student;
import java.util.List;

public class DeleteStudentWithDynamicArray {
    public static void withID(List<Student> studentList, int searchIdDelete){
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == searchIdDelete) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < studentList.size() - 1; i++) {
                studentList.set(i, studentList.get(i+1));
            }
            studentList.set(studentList.size() - 1, null);
            System.out.println("Delete Success!");
        }else{
            System.out.println("ID Delete is no exist");
        }
    }
}

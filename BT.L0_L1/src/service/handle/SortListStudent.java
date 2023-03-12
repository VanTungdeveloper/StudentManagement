package service.handle;

import model.Person;
import model.Student;
import java.util.Comparator;
import java.util.List;

public class SortListStudent {
    public static void withID(List<Student> studentList){
        Comparator<Student> comparator = Comparator.comparingInt(Person::getId);
        studentList.sort(comparator);
    }
}

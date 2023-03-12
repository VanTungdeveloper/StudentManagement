package service.handle;

import model.Student;

public class Input {
    public static void informationStudent(Student student){
        ValidateInput.name(student);
        ValidateInput.birthDay(student);
        ValidateInput.address(student);
        ValidateInput.height(student);
        ValidateInput.weight(student);
        ValidateInput.studentID(student);
        ValidateInput.university(student);
        ValidateInput.universityStartYear(student);
        ValidateInput.GPA(student);
    }
}

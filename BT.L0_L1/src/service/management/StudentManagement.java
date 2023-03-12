package service.management;
import model.Student;
import service.crud.DeleteStudent;
import service.crud.Display;
import service.crud.SearchStudent;
import service.crud.UpdateStudent;
import service.handle.Input;
import service.handle.WriteFile;

import java.util.*;

public class StudentManagement {
    private final static List<Student> studentList = new ArrayList<>();

    public static void add() {
        Student student = new Student();
        System.out.println("Add new student!!!");
        System.out.println("Enter the student information with ID: " + student.getId());
        Input.informationStudent(student);
        studentList.add(student);
        System.out.println("Add student success!");
    }

    public static void search() {
        SearchStudent.withID(studentList);
    }

    public static void update() {
        UpdateStudent.withID(studentList);
    }

    public static void delete() {
        DeleteStudent.withID(studentList);
    }

    public static void displayPercentAcademicAbility() {
        Display.percentAcademicAbility(studentList);
    }

    public static void displayPercentMarkAverage() {
       Display.PercentGPAAverage(studentList);
    }

    public static void showListStudentAcademicAbility() {
       Display.listStudentAccordingAcademicAbility(studentList);
    }

    public static void writeFile() {
        try {
            WriteFile.writeListStudentToFile(studentList);
            System.out.println("Write list student to file success!");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void showListStudent() {
        System.out.println("List student: ");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

}

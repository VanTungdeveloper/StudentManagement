package service.management;
import model.Student;
import service.crud.dynamicarray.DeleteStudentWithDynamicArray;
import service.crud.dynamicarray.SearchStudentWithDynamicArray;
import service.crud.dynamicarray.UpdateStudentWithDynamicArray;
import service.crud.Display;
import service.crud.staticarray.SearchStudentWithStaticArray;
import service.crud.staticarray.UpdateStudentWithStaticArray;
import service.handle.Input;
import service.handle.WriteFile;

import java.util.*;

public class StudentManagement {
    private static int index = 0;
    private final static Scanner sc = new Scanner(System.in);
    private final static int LENGTH_STUDENTS = 2;
    private static Student[] students = new Student[LENGTH_STUDENTS];
    private static List<Student> studentList = Arrays.asList(students);
    private static void setIndex(int i) {
        index = i;
    }
    public static void add() {
        System.out.println("Add new student!!!");
        if(index < students.length) {
            students[index] = new Student();
            System.out.println("Enter the student information with ID: " + students[index].getId());
            Input.informationStudent(students[index]);
            setIndex(++index);
            System.out.println("Add student success!");
        }else{
            System.out.println("Static Array is fullStack ----> Convert to Dynamic array");
            Student student = new Student();
            System.out.println("Enter the student information with ID: " + student.getId());
            Input.informationStudent(students[index]);
            studentList.add(students[index]);
            setIndex(++index);
        }
    }

    public static void search() {
        if(students[0] == null){
            System.out.println("ListStudent is empty!");
        }else{
            System.out.print("Enter ID want to search: ");
            int searchID = Integer.parseInt(sc.nextLine());
            if(index < students.length){
                SearchStudentWithStaticArray.withID(students, searchID);
            }else{
                SearchStudentWithDynamicArray.withID(studentList, searchID);
            }
        }
    }

    public static void update() {
        if(students[0] == null){
            System.out.println("ListStudent is empty!");
        }else {
            System.out.print("Enter ID want to update: ");
            int searchIDUpdate = Integer.parseInt(sc.nextLine());
            if(index < students.length){
                UpdateStudentWithStaticArray.withID(students, searchIDUpdate);
            }else{
                UpdateStudentWithDynamicArray.withID(studentList, searchIDUpdate);
            }
        }
    }

    public static void delete() {
        if(students[0] == null){
            System.out.println("ListStudent is empty!");
        }else {
            System.out.print("Enter ID want to delete: ");
            int searchIdDelete = Integer.parseInt(sc.nextLine());
            if(index < students.length){
                UpdateStudentWithStaticArray.withID(students, searchIdDelete);
            }else{
                DeleteStudentWithDynamicArray.withID(studentList, searchIdDelete);
            }
        }
    }

    public static void displayPercentAcademicAbility() {
        Display.percentAcademicAbility(studentList);
    }

    public static void displayPercentMarkAverage() {
       Display.PercentGPAAverage(studentList);
    }

    public static void showListStudentAcademicAbility() {
        if (studentList.get(0) == null) {
            System.out.println("no list academicAbility no exist or empty!");
        }else{
            System.out.print("Enter academicAbility want to display(POOR, WEAK, AVERAGE, GOOD, GREAT, EXCELLENT): ");
            String academicAbilityDisplay = sc.nextLine();
            Display.listStudentAccordingAcademicAbility(studentList, academicAbilityDisplay);
        }
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
        if(students[0] == null) System.out.println("Array is empty!");
        else{
            System.out.println("List student: ");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

}

package service.handle;

import model.Student;
import java.util.Date;
import java.util.Scanner;
import static constant.Constant.*;

public class ValidateInput {
    private final static Scanner sc = new Scanner(System.in);
    // Name
    public static void name(Student student) {
        while (true) {
            try {
                System.out.print("Name: ");
                String name = sc.nextLine();
                if (!name.isEmpty() && name.length() < NAME_LENGTH) {
                    student.setName(name);
                    break;
                }
            }catch (Exception e){
            }
        }
    }

    public static void birthDay(Student student) {
        while (true) {
            System.out.print("BirthDay(DD/MM/YYYY): ");
            String birthDay = sc.nextLine();
            try {
                Date date = DATE_FORMAT.parse(birthDay);
                if (birthDay.equals(DATE_FORMAT.format(date))) {
                    student.setBirthDay(birthDay);
                    break;
                }
            } catch (Exception ignored) {
            }
        }
    }

    public static void address(Student student) {
        while (true) {
            try {
                System.out.print("Address: ");
                String address = sc.nextLine();
                if (!address.isEmpty() && address.length() < ADDRESS_LENGTH) {
                    student.setAddress(address);
                    break;
                }
            }catch (Exception e){

            }

        }
    }

    public static void height(Student student) {
        while (true) {
            System.out.print("Height: ");
            String heightStr = sc.nextLine();
            try {
                double height = Double.parseDouble(heightStr);
                if (height > Height.MIN && height < Height.MAX) {
                    student.setHeight(height);
                    break;
                }
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public static void weight(Student student) {
        while (true) {
            System.out.print("Weight: ");
            String weightStr = sc.nextLine();
            try {
                double weight = Double.parseDouble(weightStr);
                if (weight > Weight.MIN && weight < Weight.MAX) {
                    student.setWeight(weight);
                    break;
                }
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public static void studentID(Student student) {
        while (true) {
            try{
                System.out.print("StudentID: ");
                String studentID = sc.nextLine();
                student.setStudentID(studentID);
                if (!studentID.isEmpty() && studentID.length() == STUDENT_ID_LENGTH) {
                    student.setStudentID(studentID);
                    break;
                }
            }catch (Exception e){

            }

        }
    }

    public static void university(Student student) {
        while (true) {
            try{
                System.out.print("University: ");
                String university = sc.nextLine();
                student.setUniversity(university);
                if (!university.isEmpty() && university.length() < UNIVERSITY_LENGTH) {
                    student.setUniversity(university);
                    break;
                }
            }catch (Exception e){
            }
        }
    }

    public static void universityStartYear(Student student) {
        while (true) {
            try{
                System.out.print("UniversityStartYear: ");
                Integer universityStartYear = Integer.parseInt(sc.nextLine());
                student.setUniversityStartYear(universityStartYear);
                if (universityStartYear.toString().length() == UniversityStartYear.YEAR_LENGTH && universityStartYear > UniversityStartYear.YEAR_MIN && universityStartYear < UniversityStartYear.YEAR_MAX) {
                    student.setUniversityStartYear(universityStartYear);
                    break;
                }
            }catch (Exception e){

            }

        }
    }

    public static void GPA(Student student) {
        while (true) {
            try{
                System.out.print("GPA: ");
                Double gpa = Double.parseDouble(sc.nextLine());
                if (!gpa.equals(null) && gpa >= GPA.MIN && gpa <= GPA.MAX) {
                    student.setGPA(gpa);
                    break;
                }
            }catch (Exception e){
            }

        }
    }

}

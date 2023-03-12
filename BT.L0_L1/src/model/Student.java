package model;

public class Student extends Person {
    private String studentID;
    private String university;
    private Integer universityStartYear;
    private Double GPA;

    private AcademicAbility academicAbility = null;
    public Student() {
        super();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getUniversityStartYear() {
        return universityStartYear;
    }

    public void setUniversityStartYear(Integer universityStartYear) {
        this.universityStartYear = universityStartYear;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
        academicAbility = setAcademicAbility(GPA);
    }

    private AcademicAbility setAcademicAbility(Double GPA){
        if(GPA < 3)  return AcademicAbility.POOR;
        if(GPA < 5) return AcademicAbility.WEAK;
        if(GPA < 6.5) return AcademicAbility.AVERAGE;
        if(GPA < 7.5) return AcademicAbility.GOOD;
        if(GPA < 9) return AcademicAbility.GREAT;
        if(GPA <= 10) return AcademicAbility.EXCELLENT;
        return null;
    }

    public AcademicAbility getAcademicAbility(){
        return academicAbility;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID = " + getId() +
                ", Name='" + getName() + '\'' +
                ", BirthDay =" + getBirthDay() +
                ", Address='" + getAddress() + '\'' +
                ", StudentID='" + studentID + '\'' +
                ", University='" + university + '\'' +
                ", UniversityStartYear=" + universityStartYear +
                ", GPA=" + GPA +
                ", AcademicAbility=" + academicAbility +
                ", Height=" + getHeight() +
                ", Weight=" + getWeight() +
                '}';
    }
}
package service.crud;

import model.AcademicAbility;
import model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Display {
    private static double percent(double a, double b) {
        return  (a/b) * (100);
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void percentAcademicAbility(List<Student> studentList){
        Map<String, Double> mapAcademicAbility = new HashMap<>();
        mapAcademicAbility.put(AcademicAbility.POOR.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.POOR)).count(), studentList.size()));
        mapAcademicAbility.put(AcademicAbility.WEAK.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.WEAK)).count(), studentList.size()));
        mapAcademicAbility.put(AcademicAbility.AVERAGE.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.AVERAGE)).count(), studentList.size()));
        mapAcademicAbility.put(AcademicAbility.GOOD.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.GOOD)).count(), studentList.size()));
        mapAcademicAbility.put(AcademicAbility.GREAT.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.GREAT)).count(), studentList.size()));
        mapAcademicAbility.put(AcademicAbility.EXCELLENT.toString(), percent(studentList.stream().filter(student -> student.getAcademicAbility().equals(AcademicAbility.EXCELLENT)).count(), studentList.size()));

        LinkedHashMap<String, Double> sortedMap = mapAcademicAbility.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry + "%");
        }
    }

    public static void PercentGPAAverage(List<Student> studentList){
        Map<Integer, Double> mapAverageNumber = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            for (Student student : studentList) {
                if (i == (int) Math.floor(student.getGPA())) {
                    count++;
                }
            }
            mapAverageNumber.put(i, (1.0 * count) / (1.0 * studentList.size()) * (100.0));
        }
        if (studentList.size() == 0) {
            System.out.println("List is empty!");
        } else {
            for (Integer i : mapAverageNumber.keySet()) {
                System.out.println(i + ": " + mapAverageNumber.get(i) + "%");
            }
        }
    }
    public static void listStudentAccordingAcademicAbility(List<Student> studentList){
        System.out.println("Enter academicAbility want to display(POOR, WEAK, AVERAGE, GOOD, GREAT, EXCELLENT): ");
        int checkAcademicAbilityDisplay = 0;
        String academicAbilityDisplay = sc.nextLine();
        for (Student student : studentList) {
            if (student.getAcademicAbility().toString().equals(academicAbilityDisplay)) {
                checkAcademicAbilityDisplay = 1;
                System.out.println(student);
            }
        }
        if(checkAcademicAbilityDisplay == 0) System.out.println("no list academicAbility no exist or empty!");
    }
}

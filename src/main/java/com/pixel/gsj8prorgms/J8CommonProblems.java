package com.pixel.gsj8prorgms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J8CommonProblems {
    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Find the list of students whose rank is in between 50 and 100
        List<Student> filteredList = studentList.stream().filter(student->student.getRank()< 50 && student.getRank() <100).collect(Collectors.toList());
        //System.out.println(filteredList);
        //2. Find the Students who stays in Karnataka and sort them by their names
        List<Student> studentListByCity = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(s->"Male".equals(s.getGender())))
                .collect(Collectors.toList());
        //System.out.println(studentListByCity);
        // 3. Find all departments names
        List<String> deptList = studentList.stream().distinct().map(Student::getDept).collect(Collectors.toList());
        //System.out.println(deptList);
        //4.  Find all the contact numbers
        List<String> contactList = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
        System.out.println(contactList);
        Map<String, Optional<Student>> stdMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(stdMap);
    }
}

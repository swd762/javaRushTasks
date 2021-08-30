package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {

    private List<Student> students;
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student resultStudent = students.get(0);
        double maxAverageGrade = resultStudent.getAverageGrade();
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverageGrade) {
                resultStudent = student;
                maxAverageGrade = resultStudent.getAverageGrade();
            }
        }
        Student result = students.stream().max(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getAverageGrade() > o2.getAverageGrade() ? 1 : -1;
            }
        }).get();
        return result;
    }

    public Student getStudentWithMinAverageGrade() {
        Student result = students.stream().min(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAverageGrade() > o2.getAverageGrade() ? 1 : -1;
            }
        }).get();
        return result;
    }

    public void expel(Student student) {
        students.remove(student);
    }

//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < 20 ; i++) {
//            students.add(new Student(String.valueOf(i), i + 20, i * 2));
//        }
//        University un = new University("111", 22);
//        un.setStudents(students);
//        System.out.println(un.getStudentWithMaxAverageGrade().getName());
//        System.out.println(un.getStudentWithMinAverageGrade().getName());
//        un.expel(un.getStudentWithMinAverageGrade());
//        System.out.println(un.getStudentWithMinAverageGrade().getName());
//    }

}
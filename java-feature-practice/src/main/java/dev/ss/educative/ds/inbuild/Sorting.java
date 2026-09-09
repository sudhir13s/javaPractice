package dev.ss.educative.ds.inbuild;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

  public static void main(String[] args) {

    List<Integer> list1= new ArrayList<>(10);
    list1.add(1);
    list1.add(5);
    list1.add(2);
    list1.add(4);
    list1.add(3);

    Collections.sort(list1);
    Collections.sort(list1, Collections.reverseOrder());
    list1.sort(Comparator.naturalOrder());

    List<Student> list2= new ArrayList<>(5);
    Student student1 = new Student("Alex", 20);
    Student student2 = new Student("Al", 19);
    Student student3 = new Student("Adam", 21);

    list2.add(student1);
    list2.add(student2);
    list2.add(student3);

    list2.sort(new StudentNameComparator());
    list2.sort(new StudentAgeComparator());
    list2.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    list2.sort(Comparator.comparing(Student::getName));
    list2.sort(Comparator.comparingInt(s -> s.getAge()));
    list2.sort(Comparator.comparingInt(Student::getAge));
    list2.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));


  }
}

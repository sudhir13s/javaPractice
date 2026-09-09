package dev.ss.educative.ds.inbuild;

import java.util.Comparator;

class Student implements Comparable<Student> {
  private String name = null;
  private int age;

  Student(String name, int age) {
    super();
    this.setName(name);
    this.setAge(age);
  }

  @Override
  public String toString() {
    return getName();
  }

  String getName() {
    return name;
  }
  private void setName(String name) { this.name = name; }
  int getAge() {
    return age;
  }
  private void setAge(int age) { this.age = age; }
  @Override
  public int compareTo(Student o) {
    if(getAge() == o.getAge())
      return 0;
    else if(getAge() < o.getAge())
      return 1;
    else
      return -1;
  }


}

class StudentNameComparator implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return s1.getName().compareToIgnoreCase(s2.getName());
  }
}

class StudentAgeComparator implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
    return Integer.compare(s1.getAge(), s2.getAge());
  }
}

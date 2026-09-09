package dev.ss.educative.ds.inbuild;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueueInterface {
  public static void main(String[] args) {

    Queue<Integer> priorityQueue = new PriorityQueue<>(10);
    Queue<Integer> arrayDeque = new ArrayDeque<>(10);

    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.offer(6);

    queue.poll();
    queue.remove();

    queue.peek();
    queue.contains(1);
    queue.size();


    PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();

    // java lambda comparator
    PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<Integer>((Integer a, Integer b) -> Integer.compare(a, b));
    PriorityQueue<Integer> priorityQueue3 = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));
    PriorityQueue<Integer> priorityQueue4 = new PriorityQueue<Integer>((a, b) -> a - b);


    // java method reference comparator
    PriorityQueue<Integer> priorityQueue5 = new PriorityQueue<Integer>(Integer::compare);
    PriorityQueue<Integer> priorityQueue6 = new PriorityQueue<Integer>(
        Comparator.comparingInt(Integer::intValue).reversed()
    );

    Student student1 = new Student("Alex", 20);
    Student student2 = new Student("Max", 21);

    // Java old comparator
    PriorityQueue<Student> studentQueue = new PriorityQueue<Student>(new StudentNameComparator());
    PriorityQueue<Student> studentQueue1 = new PriorityQueue<Student>(
        new Comparator<Student>() {
          @Override
          public int compare(Student o1, Student o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
          }
        }
    );

    // java lambda comparator
    PriorityQueue<Student> studentQueue3 = new PriorityQueue<Student>((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    PriorityQueue<Student> studentQueue4 = new PriorityQueue<Student>(Comparator.comparingInt(s -> s.getAge()));

    // java method reference comparator
    PriorityQueue<Student> studentQueue5 = new PriorityQueue<Student>(Comparator.comparing(Student::getName));
    PriorityQueue<Student> studentQueue6 = new PriorityQueue<Student>(
        Comparator.comparing(Student::getName).thenComparing(Student::getAge)
    );

  }
}



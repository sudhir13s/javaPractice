package dev.ss.educative.ds.inbuild;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetInterface {

  public static void main(String[] args) {

    Set<Integer> s1 = new HashSet<>(10);
    Set<Integer> s2 = new LinkedHashSet<>(10);
    Set<Integer> s3 = new TreeSet<>();

    HashSet<Integer> hashSet = new HashSet<Integer>(10);
    TreeSet<Integer> treeSet = new TreeSet<>();

    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    hashSet.add(4);

    hashSet.clear();
    hashSet.isEmpty();
    hashSet.contains(1);
    hashSet.remove(1);
    hashSet.size();
    hashSet.clear();

    for (Integer val: hashSet) {
      System.out.println(val);
    }
    hashSet.forEach(integer -> System.out.println(integer));
    hashSet.forEach(System.out::println);

    // treeSet -
    treeSet.add(1);
    treeSet.add(2);
    treeSet.add(3);
    treeSet.add(4);
    treeSet.add(5);

    // TreeSet
    System.out.println("Lowest Value polled: " + treeSet.pollFirst());
    System.out.println("Highest Value polled: " + treeSet.pollLast());
    System.out.println("Lowest Value: " + treeSet.first());
    System.out.println("Highest Value: " + treeSet.last());

    // NavigableSet
    System.out.println("Reverse Set: "+ treeSet.descendingSet());
    System.out.println("Head Set: "+ treeSet.headSet(2, true));
    System.out.println("SubSet:  " + treeSet.subSet(2, false, 4, true));
    System.out.println("TailSet:  " + treeSet.tailSet(4, false));

    // SortedSetSet
    System.out.println("Initial Set: " + treeSet);
    System.out.println("Head Set: " + treeSet.headSet(3));
    System.out.println("SubSet: " + treeSet.subSet(2, 4));
    System.out.println("TailSet: " + treeSet.tailSet(4));



  }
}

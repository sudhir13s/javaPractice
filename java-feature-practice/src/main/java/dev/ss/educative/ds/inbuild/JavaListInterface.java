package dev.ss.educative.ds.inbuild;

import java.util.*;
import java.util.stream.IntStream;

public class JavaListInterface {

  public static void main(String[] args) {
    // List interface types
    List<Integer> list1= new ArrayList<>(10);
    List<Integer> list2 = new LinkedList<>();
    List<Integer> list3 = new Vector<>(10);
    List<Integer> list4 = new Stack<>();

    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    Collection<Integer> numbers = IntStream.range(0, 10).boxed().toList();
    List<Integer> list6 = new ArrayList<>(numbers);

    list5.add(1);
    list5.add(6, 1);
    list5.remove(0);

    list5.set(0, 5);
    list5.get(0);
    list5.contains(1);
    list5.isEmpty();
    list5.indexOf(1);
    list5.lastIndexOf(1);
    list5.equals(1);
    list5.size();

    System.out.println("list5.toArray(): " + Arrays.toString(list5.toArray()));
    for(int i = 0; i < list5.size(); i++) {
      System.out.println(list5.get(i));
    }

    for (Integer val: list5) {
      System.out.println("list5 - for loop - val: " + val);
    }

    list5.forEach(val -> System.out.println("list5 - forEach lambda - val:" + val));
    list5.forEach(System.out::println);

    list5.sort(Comparator.naturalOrder());

    list5.clear();

  }
}

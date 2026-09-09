package dev.ss.educative.ds.inbuild;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaArrays {



  public static void main(String[] args) {
//    int intArray[];
//    int[] intArray = new int[9];
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9};

    String[] str;
    char[] charArray;
    byte[] byteArray;
    short[] shortsArray;
    boolean[] booleanArray;
    long[] longArray;
    float[] floatArray;
    double[] doubleArray;
    Object[]  ao;      // array of Object
    Collection[] ca;  // array of Collection of unknown type

    // 2D array
    int[][] intArray2D = new int[][]{ {1,2,3}, {4,5,6}, {7,8,9}};
    Student[] myStudents = new Student[]{new Student("Dharma", 20),
        new Student("sanvi", 21),new Student("Rupa", 19),new Student("Ajay", 22)};

    //iterate
    for (int i = 0; i < intArray.length; i++) {
      System.out.println("intArray[" + i + "]: " + intArray[i]);
    }
    for (Student s:myStudents) {
      System.out.println("Student: " + s);
    }

    //methods
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(myStudents));
    System.out.println(Arrays.deepToString(intArray2D));


    Arrays.sort(intArray);
    Arrays.equals(intArray, intArray);
    Arrays.deepEquals(intArray2D, intArray2D);
    Arrays.compare(intArray, intArray);
    Arrays.copyOf(intArray, 10);

    Arrays.fill(intArray, 0);
    Arrays.stream(intArray);


    Integer[] integerArray = new Integer[intArray.length];
    Arrays.setAll(integerArray, i -> integerArray[i]);
    // To boxed array
    Integer[] what = Arrays.stream( intArray ).boxed().toArray( Integer[]::new );
    Integer[] ever = IntStream.of( intArray ).boxed().toArray( Integer[]::new );
    // To boxed list
    List<Integer> you  = Arrays.stream(intArray).boxed().toList();
    List<Integer> like = IntStream.of( intArray ).boxed().collect(Collectors.toList());

    // Arrays.asList()
    Integer[] integerArray1 = new Integer[] { 10, 20, 30, 40 };
    List<Integer> list = Arrays.asList(integerArray1);
    // Below add line will throw exception - as Arrays.asList() returns fixed size list
    // list.add(50);
    System.out.println("The list is: " + list);


    // .clone()
    int cloneArray[] = intArray.clone();

    // anything special
    // Reflection - modify array content.
    Array.setInt(intArray, 0, 10);

    charArray = new char[]{'a', 'b', 'c', 'd', 'c', 'd', 'a'};
    var map = new HashMap<Character, Integer>();
    for (var c : charArray) {
      map.merge(c, 1, Integer::sum);
    }
    System.out.println("char map " + map);
  }
}




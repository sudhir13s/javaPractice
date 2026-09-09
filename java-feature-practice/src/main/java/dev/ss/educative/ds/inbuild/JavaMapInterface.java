package dev.ss.educative.ds.inbuild;

import java.util.*;

public class JavaMapInterface {

  public static void main(String[] args) {
    Hashtable<Integer,String> map=new Hashtable<Integer,String>(10);
    HashMap<Integer, String> hm1 = new HashMap<>(10);
    LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<>(10);
    TreeMap<Integer, String> hm3 = new TreeMap<>();


    // Add Elements using put method
    hm1.put(1, "Geeks");
    hm1.put(2, "For");
    hm1.put(3, "Geeks");
    hm1.put(4, "For");

    hm1.get(1);
    hm1.getOrDefault(5, "Default value");
    hm1.remove(5);
    hm1.isEmpty();
    hm1.size();

    hm1.containsKey(1);
    hm1.containsValue("For");

    hm1.entrySet();
    hm1.keySet();
    hm1.values();


    for (Map.Entry<Integer, String> e: hm1.entrySet()) {
      System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }

    hm1.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    hm1.entrySet().forEach(System.out::println);






  }
}

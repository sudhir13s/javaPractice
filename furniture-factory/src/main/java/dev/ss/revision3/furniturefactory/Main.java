package dev.ss.revision3.furniturefactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    FurnitureOrder furnitureOrder = new FurnitureOrder();
    furnitureOrder.addToOrder(Furniture.CHAIR, 2);
    furnitureOrder.addToOrder(Furniture.TABLE, 1);
    furnitureOrder.addToOrder(Furniture.TABLE, 4);
    furnitureOrder.addToOrder(Furniture.COUCH, 1);

    HashMap<Furniture, Integer> orders = furnitureOrder.getOrderedFurniture();
    for (Map.Entry<Furniture, Integer> order : orders.entrySet()) {
      System.out.println(order.getKey() + " | " + order.getValue());
    }
    System.out.println();
    System.out.println("getTypeCount CHAIR: " + furnitureOrder.getTypeCount(Furniture.CHAIR));
    System.out.println("getTypeCount TABLE: " + furnitureOrder.getTypeCount(Furniture.TABLE));
    System.out.println("getTypeCount COUCH: " + furnitureOrder.getTypeCount(Furniture.COUCH));
    System.out.println();
    System.out.println("getTypeCost CHAIR: " + furnitureOrder.getTypeCost(Furniture.CHAIR));
    System.out.println("getTypeCost TABLE: " + furnitureOrder.getTypeCost(Furniture.TABLE));
    System.out.println("getTypeCost COUCH: " + furnitureOrder.getTypeCost(Furniture.COUCH));
    System.out.println();
    System.out.println("getTotalOrderCost: " + furnitureOrder.getTotalOrderCost());
    System.out.println("getTotalOrderQuantity: " + furnitureOrder.getTotalOrderQuantity());
  }
}

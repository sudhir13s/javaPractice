package dev.ss.leetcode.furniturefactory;

import java.util.HashMap;

public interface FurnitureOrderInterface {

  void addToOrder(Furniture type, int count);

  HashMap<Furniture, Integer> getOrderedFurniture();

  int getTypeCount(Furniture type);

  float getTypeCost(Furniture type);

  float getTotalOrderCost();

  int getTotalOrderQuantity();
}

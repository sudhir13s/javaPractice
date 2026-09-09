package dev.ss.leetcode.furniturefactory;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {

  private final HashMap<Furniture, Integer> order;

  FurnitureOrder() {
    super();
    this.order = new HashMap<>(1);
  }

  @Override
  public void addToOrder(Furniture type, int count) {
    this.order.put(type, this.order.getOrDefault(type, 0) + count);
  }

  @Override
  public HashMap<Furniture, Integer> getOrderedFurniture() {
    return this.order;
  }

  @Override
  public int getTypeCount(Furniture type) {
    return this.order.entrySet().stream()
        .filter(tp -> tp.getKey() == type)
        .mapToInt(Map.Entry::getValue)
        .sum();
  }

  @Override
  public float getTypeCost(Furniture type) {
    return type.cost();
  }

  @Override
  public float getTotalOrderCost() {
    return (float)
        this.order.entrySet().stream()
            .mapToDouble(entry -> (double) (entry.getKey().cost() * entry.getValue()))
            .sum();
  }

  @Override
  public int getTotalOrderQuantity() {
    return this.order.values().stream().mapToInt(i -> i).sum();
  }
}

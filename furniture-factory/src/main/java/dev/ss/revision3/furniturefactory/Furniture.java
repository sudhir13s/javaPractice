package dev.ss.revision3.furniturefactory;

public enum Furniture {
  CHAIR("Chair", 10.0f),
  TABLE("Table", 20.0f),
  COUCH("Couch", 100.0f);

  private final String label;
  private final float cost;

  Furniture(String label, float cost) {
    this.label = label;
    this.cost = cost;
  }

  String label() {
    return this.label;
  }

  float cost() {
    return this.cost;
  }
}

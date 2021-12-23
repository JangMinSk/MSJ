package Vo;

public class Value {
   private String name;
   private Double val;
   public Value(String name, Double val) {
      this.name=name;
      this.val=val;
   }
   public String getName() {
      return name;
   }

   public Double getVal() {
      return val;
   }
   @Override
   public String toString() {
      return name +" "+ val + "\n";
   }
}
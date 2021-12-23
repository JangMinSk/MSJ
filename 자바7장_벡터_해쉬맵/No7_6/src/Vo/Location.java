package Vo;

public class Location {
   private String name;
   private Integer num;
   private Integer no;
   
    public Location(String name,Integer num, Integer no) {
         this.name=name;
         this.num=num;
         this.no=no;
      }

   public String getName() {
      return name;
   }
   public Integer getNum() {
      return num;
   }
   public Integer getNo() {
      return no;
   }
    @Override
      public String toString() {
      
         return name+"\n"+"경도="+num+"\n"+"위도="+no+"\n"+"--------------------------";
   }

}
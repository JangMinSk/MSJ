package No7_6;

import java.util.HashMap;
import java.util.Scanner;

import Vo.Location;

public class ma {

   public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      HashMap<String,Location> ar = new HashMap<String,Location>();
         System.out.println("도시,경도,위도를 입력하세요.");
         for (int i = 0; i < 4; i++) {
            String name = scn.next();
            Integer num = scn.nextInt();
            Integer no = scn.nextInt();
      
            ar.put(name,new Location(name,num,no));
         }
         for(String key:ar.keySet()) {//for each문 for(리턴값 key:해쉬맵 래퍼런스.keyset())
            System.out.println(ar.get(key).toString());      
         }
         while(true) {
            System.out.println("검색할 학생 이름");
            String ser = scn.next();
            if (ser.equals("그만")) {
               System.out.println("종료합니다.");
               break;
            }
            else {
               int n = 0;
               System.out.println(ser);
               for (String key:ar.keySet()) {
                  if (ar.get(key).getName().equals(ser)) {
                     System.out.println(ar.get(key));
                     n++;
                     break;
                  }
               }
               if(n==0) {
                  System.out.println("재입력");
            }
         }
      }


   }

}
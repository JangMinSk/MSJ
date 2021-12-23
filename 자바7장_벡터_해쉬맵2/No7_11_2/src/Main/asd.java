package Main;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import Vo.*;

public class asd {

   public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      HashMap<String,String> cuntry=new HashMap<String,String>(); 
      System.out.println("****수도 맞추기 게임을 시작합니다.****");
      boolean end=true;
      while(end) {
         System.out.print("입력(1), 퀴즈(2), 종료(3)>>");
         int menu=scn.nextInt();
         switch(menu) {
            case 1:
               while(true) {
                  System.out.print("나라와 수도 입력>>"+"(현재 저장수:"+cuntry.size()+")");
               String c = scn.next();
               
               if (c.equals("그만")) {
                  break;
               }
            
               String c1 = scn.next();   
               if(cuntry.containsKey(c)) {//containskey:key의 모든값을 호출
                  System.out.println("중복됨");
                  continue;
               }
               cuntry.put(c,c1);
               
               }break;
         
            case 2:
               
               while (true) {   
                  Set<String> cun=cuntry.keySet();//Set keySet()메소드를 활용하여 스트링타입의 객채를 만듬.
                  Object []ar=(cun.toArray());//해시맵(HashMap)의 키(Key, KeySet)을 배열(Array)로 바꾸는 코드.
                int Quiz=((int) (Math.random() * cuntry.size()));
                String a=(String)ar[Quiz];//배열로 만듬ar객채를 a객채로 만들어줌.
                String b=cuntry.get(a);//a에저장된 배열을 get한값을 b객채로 만들어줌.
                System.out.println(a+"의 수도는?");
                String good=scn.next();
                if(good.equals("그만")) {
                   break;
                }
                if(b.equals(good)) {
                   System.out.println("정답");
                }else {               
                   System.out.println("땡");
                }         
             }break;
            case 3:
               System.out.println("종료합니다.");
               end=false;
         }
       }
}
}
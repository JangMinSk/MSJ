package ma;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Vo.Value;

public class no7_7 {

   public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      HashMap <String,Value> score=new HashMap <String,Value>();
      
      for(int i=0;i<5;i++) {
         System.out.println("�̸��� ����>>");
         String name=scn.next();
         Double val=scn.nextDouble();
         score.put(name,new Value(name,val));
      }   
         
         System.out.print("���л� ���� ���� ���� �Է�>>");
         double cut=scn.nextDouble();
         System.out.println("���л� ��� :");
         for(String key:score.keySet()) {
            if(score.get(key).getVal()>cut) {
               System.out.print(score.get(key)+" ");
         }
      }               
   }
}
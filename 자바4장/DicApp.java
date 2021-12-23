package work;

import java.util.Scanner;

class Dictionary {
   private static String[] kor= {"사랑","아기","돈","미래","희망"};
   private static String[] eng= {"love","baby","money","future","hope"};
   public static String kor2Eng(String word) {
      for (int i=0;i<kor.length;i++) {
         if(word.equals(kor[i])) {
            if(i%1!=0);
            
            else
               System.out.println(word+"은");
            return eng[i];
         }
      }
      return "false";//??false 인데 왜 ""가 들어감? String 범위값이라서 그런가?
   }
}               

   public class DicApp{
      
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
         System.out.println("한영 단어 검색 프로그램입니다.");
         while(true) {
            System.out.print("한글 단어?");
            String kl = scn.next();
            if(kl.equals("그만")) 
               break;
            String eng = Dictionary.kor2Eng(kl);
            if(eng.equals("false"))
               System.out.println(kl+"는 저의 사전에 없습니다.");
            else 
               System.out.println(eng);
         }
      }

   }

package work;

import java.util.Scanner;

class Dictionary {
   private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
   private static String[] eng= {"love","baby","money","future","hope"};
   public static String kor2Eng(String word) {
      for (int i=0;i<kor.length;i++) {
         if(word.equals(kor[i])) {
            if(i%1!=0);
            
            else
               System.out.println(word+"��");
            return eng[i];
         }
      }
      return "false";//??false �ε� �� ""�� ��? String �������̶� �׷���?
   }
}               

   public class DicApp{
      
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
         System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
         while(true) {
            System.out.print("�ѱ� �ܾ�?");
            String kl = scn.next();
            if(kl.equals("�׸�")) 
               break;
            String eng = Dictionary.kor2Eng(kl);
            if(eng.equals("false"))
               System.out.println(kl+"�� ���� ������ �����ϴ�.");
            else 
               System.out.println(eng);
         }
      }

   }

package Main;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import Vo.*;

public class asd {

   public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      HashMap<String,String> cuntry=new HashMap<String,String>(); 
      System.out.println("****���� ���߱� ������ �����մϴ�.****");
      boolean end=true;
      while(end) {
         System.out.print("�Է�(1), ����(2), ����(3)>>");
         int menu=scn.nextInt();
         switch(menu) {
            case 1:
               while(true) {
                  System.out.print("����� ���� �Է�>>"+"(���� �����:"+cuntry.size()+")");
               String c = scn.next();
               
               if (c.equals("�׸�")) {
                  break;
               }
            
               String c1 = scn.next();   
               if(cuntry.containsKey(c)) {//containskey:key�� ��簪�� ȣ��
                  System.out.println("�ߺ���");
                  continue;
               }
               cuntry.put(c,c1);
               
               }break;
         
            case 2:
               
               while (true) {   
                  Set<String> cun=cuntry.keySet();//Set keySet()�޼ҵ带 Ȱ���Ͽ� ��Ʈ��Ÿ���� ��ä�� ����.
                  Object []ar=(cun.toArray());//�ؽø�(HashMap)�� Ű(Key, KeySet)�� �迭(Array)�� �ٲٴ� �ڵ�.
                int Quiz=((int) (Math.random() * cuntry.size()));
                String a=(String)ar[Quiz];//�迭�� ����ar��ä�� a��ä�� �������.
                String b=cuntry.get(a);//a������� �迭�� get�Ѱ��� b��ä�� �������.
                System.out.println(a+"�� ������?");
                String good=scn.next();
                if(good.equals("�׸�")) {
                   break;
                }
                if(b.equals(good)) {
                   System.out.println("����");
                }else {               
                   System.out.println("��");
                }         
             }break;
            case 3:
               System.out.println("�����մϴ�.");
               end=false;
         }
       }
}
}
package per;
import java.util.Scanner;
class person {
   private String name;//�����̺� ��Ʈ�� Ÿ������ name���� ������ �ʵ�
   boolean a = false;//run() �޼ҵ� �� ������ false�ϋ� ���Ϲ���

   person(String name) {//person ��ä �������� �Ű����� String name �� ����
      this.name = name;//�Ű������� ���� String name�� person��ü�� name�� ��.
   }

   public String getName() {//private name�� ������ �� �ִ� �Լ� getName()
      return name;
   }

   public boolean run() {//���ϰ� boolean ���� �Ǿ��ִ� run()�Լ�.
      int ran[] = new int[3];//int ���� �޴� �迭 int ran[]= new int[�迭ũ��3] ����

      for (int i = 0; i < 3; i++) {//for ������ i=0���� i�� 3���� ������ ���� 1�� Ŀ���鼭 �ݺ�
         ran[i] = (int) (Math.random() * 3 + 1);//ran[index i]�� �޼��巣�� ���� �Ѱ���.
         System.out.print(ran[i] + " ");//ran[index i] ���
      }
      if (ran[0] == ran[1] && ran[1] == ran[2]) {//ran[0��°]�� ran[1��°]�� 
         //���� ran[1��°]�� ran[2����]������
         a=true;//false�� a�� true �� ��ȯ.(line 7)
         return a;//���� a
      }
      else {//���� ������ �ƴ϶��(ran[0��°]��ran[1��°]�� �����ʰų� ran[1��°]�� ran[2��°]����������)
         return a;//false a�� ����(line 7)
      }
   }
}
public class per {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("2�ο� 1~3 ���� ���� ������ �¸� ����:<ENTER>");
      System.out.println("���� �̸� ����");
      String sc = scn.next();//next()=���ڿ� 
      String sc1 = scn.next();
      person p = new person(sc);//�Է¹��� sc�� person��ü  ���۷���p ���� (line 9)
      person p2 = new person(sc1);

      System.out.println("ù ���� ���� �̸�>" + p.getName());//p.getName()ȣ��(line 13)
      System.out.println("�� ���� ���� �̸�>" + p2.getName());
      boolean b=true;//while ���ݺ� ��Ű������ b
      while (b) {   //while(true)2���� �÷��̾ ���� �̱���� �� ������ ������Ű�� ���� ���ѹݺ�
         
         System.out.print("[" + p.getName() + "]");//����Ʈ�Ѵ� ����? p.getName()��
         scn.nextLine();//<ENTER>�� �Է¹ޱ� ����
         p.run();//p���۷����� ���� run()�޼��� ȣ��
         
         if(p.a) {//���� p���۷����� a<(true��)(line 24~26) �ϋ� �Ʒ� ���ǹ� ����.
            System.out.println(p.getName()+"��");
            b=false;//break
         }
         System.out.println();//���ٳ�����
         
         if (b) {//���� (b)�� true�̸� (���� if���� �Ȱɸ��� �Ѿ�������)
            System.out.print("[" + p2.getName() + "]");
            scn.nextLine();
            p2.run();
            
         if(p2.a) {
            System.out.println(p2.getName()+"��");
            b=false;
         }
            System.out.println();
         }
      }
   }
}
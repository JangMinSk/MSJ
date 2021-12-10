package per;
import java.util.Scanner;
class person {
   private String name;//프라이빗 스트링 타입으로 name값을 저장할 필드
   boolean a = false;//run() 메소드 의 조건이 false일떄 리턴받음

   person(String name) {//person 객채 생성자의 매개변수 String name 을 받음
      this.name = name;//매개변수로 받은 String name이 person객체의 name이 됨.
   }

   public String getName() {//private name의 접근할 수 있는 함수 getName()
      return name;
   }

   public boolean run() {//리턴값 boolean 으로 되어있는 run()함수.
      int ran[] = new int[3];//int 값을 받는 배열 int ran[]= new int[배열크기3] 생성

      for (int i = 0; i < 3; i++) {//for 문으로 i=0부터 i가 3보다 작을때 까지 1씩 커지면서 반복
         ran[i] = (int) (Math.random() * 3 + 1);//ran[index i]에 메서드랜덤 값을 넘겨줌.
         System.out.print(ran[i] + " ");//ran[index i] 출력
      }
      if (ran[0] == ran[1] && ran[1] == ran[2]) {//ran[0번째]가 ran[1번째]와 
         //같고 ran[1번째]와 ran[2번쨰]같으면
         a=true;//false값 a를 true 로 변환.(line 7)
         return a;//리턴 a
      }
      else {//위의 조건이 아니라면(ran[0번째]와ran[1번째]가 같지않거나 ran[1번째]와 ran[2번째]같지않을때)
         return a;//false a를 리턴(line 7)
      }
   }
}
public class per {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("2인용 1~3 같은 숫자 나오면 승리 시작:<ENTER>");
      System.out.println("선수 이름 기입");
      String sc = scn.next();//next()=문자열 
      String sc1 = scn.next();
      person p = new person(sc);//입력받은 sc로 person객체  레퍼런스p 생성 (line 9)
      person p2 = new person(sc1);

      System.out.println("첫 번쨰 선수 이름>" + p.getName());//p.getName()호출(line 13)
      System.out.println("두 번쨰 선수 이름>" + p2.getName());
      boolean b=true;//while 문반복 시키기위한 b
      while (b) {   //while(true)2명의 플레이어가 서로 이기기위 한 조건을 만족시키기 위해 무한반복
         
         System.out.print("[" + p.getName() + "]");//프린트한다 뭐를? p.getName()을
         scn.nextLine();//<ENTER>를 입력받기 위해
         p.run();//p레퍼런스를 통해 run()메서드 호출
         
         if(p.a) {//만약 p레퍼런스의 a<(true값)(line 24~26) 일떄 아래 조건문 실행.
            System.out.println(p.getName()+"승");
            b=false;//break
         }
         System.out.println();//한줄내리기
         
         if (b) {//만약 (b)가 true이면 (위의 if문에 안걸리고 넘어왔을경우)
            System.out.print("[" + p2.getName() + "]");
            scn.nextLine();
            p2.run();
            
         if(p2.a) {
            System.out.println(p2.getName()+"승");
            b=false;
         }
            System.out.println();
         }
      }
   }
}
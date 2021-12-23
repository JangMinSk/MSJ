package SVC;
import Vo.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);//레이블을 컨텐트팬에 부착
		//타이머 스레드로 사용할 Runnable 객체 생성,타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th=new Thread(runnable);//스레드 객체 생성
		
		setSize(250,150);
		setVisible(true);
		
		th.start();//타이머 스레드가 실행을 시작하게 한다.
	}
}

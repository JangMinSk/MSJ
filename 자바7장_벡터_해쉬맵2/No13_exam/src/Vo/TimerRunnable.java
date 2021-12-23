package Vo;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	private JLabel timerLabel;//Ÿ�̸� ���� ��µ� ���̺�
	
	public  TimerRunnable(JLabel timerLabel) {
		this.timerLabel=timerLabel;//�� ī��Ʈ�� ����� ���̺�
	}
	
	//������ �ڵ�, run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0;//Ÿ�̸� ī��Ʈ ��
		while(true) {
			timerLabel.setText(Integer.toBinaryString(n));//���̺� ī��Ʈ �� ���
			n++;//ī��Ʈ ����
			try {
				Thread.sleep(1000);//1�� ���� �� �ܴ�.
			}
			catch(InterruptedException e) {
				return;//���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

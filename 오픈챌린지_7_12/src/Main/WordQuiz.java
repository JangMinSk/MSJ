package Main;

import java.util.Scanner;
import java.util.Vector;

import Vo.Word;

public class WordQuiz {

	public void test(Vector<Word> v) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��ǰ���� �� �ܾ� �׽�Ʈ�� �����մϴ�.-1�� �Է��ϸ� �����մϴ�.");
			System.out.println("����" + v.size() + "���� �ܾ ��� �ֽ��ϴ�.");
			Word Quiz = v.get((int) (Math.random() * v.size()));
			System.out.println(Quiz.getKey() + "?");
			Word[] z = new Word[4];
			z[(int) (Math.random() * 4)] = Quiz;
			for (int i = 0; i < z.length; i++) {

				if (z[i] == null) {
					z[i] = v.get((int) (Math.random() * v.size()));
					if (Quiz.equals(z[i])) {
						z[i] = null;
						i--;
					} else {

						for (int j = 0; j < i; j++) {
							if (z[i].equals(z[j])) {
								z[i] = null;
								i--;
								break;
							}
						}
					}
				}
			}
			for (int i = 0; i < z.length; i++) {
				System.out.print("(" + (i + 1) + ")" + z[i].getValue());
			}
			int stop = sc.nextInt();
			if (stop == -1) {
				System.out.println("�����մϴ�.");
				break;
			}
			if (Quiz.equals(z[stop - 1])) {
				System.out.println("�����Դϴ�!");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		WordQuiz Test = new WordQuiz();
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("sex", "����"));
		v.add(new Word("Lost", "��ũ"));
		v.add(new Word("maple", "���丮"));
		boolean bo=true;
		while (bo) {
			System.out.println("�ܾ��׽�Ʈ:1 , �ܾ� ����:2, ����:3>>");
			int e = scn.nextInt();
			switch (e) {

			case 1:
				Test.test(v);
				break;

			case 2:
				while(true) {
					System.out.println("�ܾ� ���� ���ּ�");
					String tt=scn.next();
					if(tt.equals("�׸�")) {
						break;
					}
					String tt1=scn.next();
					v.add(new Word(tt,tt1));
				}break;
			case 3:
				bo=false;
				break;
			}
		}

	}
}
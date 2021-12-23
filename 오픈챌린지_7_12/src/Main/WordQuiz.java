package Main;

import java.util.Scanner;
import java.util.Vector;

import Vo.Word;

public class WordQuiz {

	public void test(Vector<Word> v) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("명품영어 의 단어 테스트를 시작합니다.-1을 입력하면 종료합니다.");
			System.out.println("현재" + v.size() + "개의 단어가 들어 있습니다.");
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
				System.out.println("종료합니다.");
				break;
			}
			if (Quiz.equals(z[stop - 1])) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Vector<Word> v = new Vector<Word>();
		WordQuiz Test = new WordQuiz();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("sex", "성별"));
		v.add(new Word("Lost", "아크"));
		v.add(new Word("maple", "스토리"));
		boolean bo=true;
		while (bo) {
			System.out.println("단어테스트:1 , 단어 삽입:2, 종료:3>>");
			int e = scn.nextInt();
			switch (e) {

			case 1:
				Test.test(v);
				break;

			case 2:
				while(true) {
					System.out.println("단어 삽입 해주셈");
					String tt=scn.next();
					if(tt.equals("그만")) {
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
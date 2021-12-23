package util;

import java.util.*;
import vo.Member;
import vo.SearchDate;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		Member newMember = new Member();// ����ó�� ���� ����.. ã�Ƽ��غ���
		System.out.println("====�� ȸ�� ���� ���====");
		System.out.println("ȸ�����̵� :");
		String id = sc.next();
		System.out.println("ȸ���̸� :");
		String name = sc.next();
		System.out.println("ȸ���̸��� :");
		String email = sc.next();
		System.out.println("ȸ���ּ� :");
		String addr = sc.next();
		System.out.println("ȸ����� :");
		String hobby = sc.next();
		System.out.println("ȸ�� ��ȭ��ȣ :");
		String tel = sc.next();
		System.out.println("ȸ������ :");
		int age = sc.nextInt();

		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setAge(age);
		return newMember;
	}

	public void printRegistSuccessMessage(String id) {
		System.out.println(id + "ȸ�� ��� ����");
	}

	public void printRegistFailMessage(String id) {
		System.out.println(id + "ȸ�� ��� ����");
	}

	public void printMemberList(Member[] memberArray) {
		if (memberArray.length == 0) {
			System.out.println("�߰��� ȸ�� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}

	public String getId(String msgKind, Scanner scan) {
		System.out.println(msgKind + "���̵� :");
		return scan.next();
		// ����ڰ� �Է��� ���̵� �ٷ� ����
	}

	public Member getNewMember(Member oldMember, Scanner sc) {
		Member member = new Member();
		System.out.println("====�� ȸ�� ���� ����====");
		System.out.println("ȸ�� ���̵� :" + oldMember.getId());// ������ �����ؾ��ϹǷ� ������� ���ϰų� �ڷε��ư��� ��� �߰��ϱ�.
		System.out.println("���� �̸�: " + oldMember.getName());
		System.out.print("�� ȸ�� �̸� :");
		String name = sc.next();
		System.out.println("���� �̸��� : " + oldMember.getEmail());
		System.out.print("�� ȸ�� �̸��� :");
		String email = sc.next();
		System.out.println("���� �ּ� :" + oldMember.getAddr());
		System.out.print("�� ȸ�� �ּ� :");
		String addr = sc.next();
		System.out.println("���� ��� :" + oldMember.getHobby());
		System.out.print("�� ȸ�� ��� :");
		String hobby = sc.next();
		System.out.println("���� ��ȭ��ȣ :" + oldMember.getTel());
		System.out.print("�� ȸ�� ��ȭ��ȣ :");
		String tel = sc.next();
		System.out.println("���� ���� :" + oldMember.getAge());
		System.out.println("�� ȸ�� ���� :");
		int age = sc.nextInt();

		member.setId(oldMember.getId());
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setHobby(hobby);
		member.setTel(tel);
		member.setAge(age);

		return member;
	}

	public void printUpdateSuccessMessage(String id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}

	public void printUpdateFailMessage(String id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}

	public void printDeleteSuccessMessage(String id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}

	public void printDeleteFailMessage(String id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}

	public SearchDate getSearchData(Scanner scan) {
		System.out.println("�˻� ������ �����Ͻÿ�.");
		System.out.println("1. ���̵�");
		System.out.println("2. �̸�");
		System.out.println("�˻� ���� :");
		String searchCondition = scan.next();// �˻� ���� ����
		String searchValue = null;// �˻� ��

		if (searchCondition.equals("1")) {
			System.out.println("�˻��� ���̵� :");
			searchValue = scan.next();
		} else if (searchCondition.equals("2")) {
			System.out.println("�˻��� �̸� :");
			searchValue = scan.next();
		}
		SearchDate SearchDate = new SearchDate();// ������ ���� �� �� �̹Ƿ� ������ ���� �Ӽ����� ������ Ŭ���� ����

		SearchDate.setSearchCondition(searchCondition);
		SearchDate.setSearchValue(searchValue);
		return SearchDate;
	}

	public void printSearchMember(Member member) {
		if (member == null) {
			System.out.println("�˻��� ����� �����ϴ�.");
		} else {
			System.out.println(member.getId() + "���� �˻��� ���");
			System.out.println(member);
		}
	}

	public void printSearchMemberArray(Member[] memberArray) {
		if (memberArray.length == 0) {
			System.out.println("�̸����� �˻��� ����� �����ϴ�.");
		} else {
			System.out.println("�̸����� �˻��� ��� ");
			for (int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}
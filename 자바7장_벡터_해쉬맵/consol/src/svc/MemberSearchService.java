package svc;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {
	public Member searchMemberById(String searchValue) {
		Member member = null;

		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (MemberUI.memberArray[i].getId().equals( String.valueOf(searchValue))) {

				member = MemberUI.memberArray[i];
				break;
			}
		}
		return member;
	}

	public Member[] searchMemberByName(String searchValue) {
		Member[] searchMemberArray = null;
		int count = 0;
		Member[] tempArray = new Member[MemberUI.memberArray.length];

		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (searchValue.contentEquals(MemberUI.memberArray[i].getName())) {
				tempArray[count++] = MemberUI.memberArray[i];
			}
		}

		searchMemberArray = new Member[count];

		for (int i = 0; i < count; i++) {
			searchMemberArray[i] = tempArray[i];
		}

		return searchMemberArray;
	}
}
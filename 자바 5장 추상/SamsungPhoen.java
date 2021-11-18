package over;
interface PhoneInterface{//인터페이스 선언
	final int TIMEOUT = 10000;//상수 필드선언
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class SamsungPhoen implements PhoneInterface{//인터페이스 구현
	public void sendCall() {
		System.out.println("RRRRRRR");
	}
	public void receiveCall() {
		System.out.println("전화받아");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다");
	}
	
	public static void main(String[] args) {
		SamsungPhoen phone = new SamsungPhoen();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();

	}

}

package over;
interface PhoneInterface{//�������̽� ����
	final int TIMEOUT = 10000;//��� �ʵ弱��
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class SamsungPhoen implements PhoneInterface{//�������̽� ����
	public void sendCall() {
		System.out.println("RRRRRRR");
	}
	public void receiveCall() {
		System.out.println("��ȭ�޾�");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�");
	}
	
	public static void main(String[] args) {
		SamsungPhoen phone = new SamsungPhoen();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();

	}

}

package section1;

abstract class Phone {
	abstract void turnOn();
}

class SamsongPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("�Ｚ���� �������ϴ�.");
	}
}

class LZPhone extends Phone {
	void turnOn() {
		System.out.println("�������� �������ϴ�.");
	}
}

class Person {
	Phone phone;
	
	void buyPhone(Phone phone) {
//		phone = new LZPhone(); // ���� �� ������ ����
		this.phone = phone;
		System.out.println("��ȣ �� �� ���.");
	}
	
	void phoneOn() {
		phone.turnOn();
	}
}

public class PhoneDemo2 {
	public static void main(String[] args) {
		Person p = new Person();
		Phone phone = new LZPhone();
		p.buyPhone(phone);
		p.phoneOn();
		
		Phone sphone = new SamsongPhone();
		p.buyPhone(sphone);
		p.phoneOn();
	}
}

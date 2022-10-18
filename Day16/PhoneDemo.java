package section1;

abstract class Phone {
	abstract void turnOn ();
}

class LGPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("LG���� �������ϴ�.");
	}
}

class SamsongPhone extends Phone {

	@Override
	void turnOn() {
		System.out.println("�Ｚ���� �������ϴ�.");
	}	
}


// ��ü�� Ŭ����
class Person {
	void buyPhone(Phone p) {
//		Phone p = new Phone();
		p.turnOn();
	}
}

// ����� Ŭ����
public class PhoneDemo {
	public static void main(String[] args) {
		// ���α׷��� ���۰� ��
		// ��ü�� Ŭ���� �ҷ��ٰ� ����ݾƿ�.
		Person person = new Person();
		Phone phone = new LGPhone();
		person.buyPhone(phone);
	}
}

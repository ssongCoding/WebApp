package section1;

abstract class Phone {
	abstract void turnOn ();
}

class LGPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("LG폰이 켜졌습니다.");
	}
}

class SamsongPhone extends Phone {

	@Override
	void turnOn() {
		System.out.println("삼성폰이 켜졌습니다.");
	}	
}


// 객체용 클래스
class Person {
	void buyPhone(Phone p) {
//		Phone p = new Phone();
		p.turnOn();
	}
}

// 실행용 클래스
public class PhoneDemo {
	public static void main(String[] args) {
		// 프로그램의 시작과 끝
		// 객체용 클래스 불러다가 놀거잖아요.
		Person person = new Person();
		Phone phone = new LGPhone();
		person.buyPhone(phone);
	}
}

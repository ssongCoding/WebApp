package section1;

public class Computer {
	Speaker s;
	
	Computer(Speaker s) {
		this.s = s;
	}
	
	void turnOn() {
		System.out.println("��ǻ�Ͱ� �������ϴ�.");
		s.turnOn();
	}
}

package section1;

public class Person {
	Computer c;
	
	Person(Computer c) { // Computer c = new Computer(s);
		this.c = c;
		// this �� ��ü �ڱ� �ڽ�
	}
	
	void turnOn() {
		c.turnOn();
	}
}

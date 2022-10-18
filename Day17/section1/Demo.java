package section1;

public class Demo {
	public static void main(String[] args) {
		Speaker s = new Speaker();
		Computer c1 = new Computer(s);
		Person p = new Person(c1);
		p.turnOn();
		// 생성자의 역할
		// : 객체를 생성 "메모리에 올려서" 사용 할 준비를 마치는 것
		
	}
}

package section1;

public class Demo {
	public static void main(String[] args) {
		Speaker s = new Speaker();
		Computer c1 = new Computer(s);
		Person p = new Person(c1);
		p.turnOn();
		// �������� ����
		// : ��ü�� ���� "�޸𸮿� �÷���" ��� �� �غ� ��ġ�� ��
		
	}
}

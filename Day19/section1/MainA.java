package section1;

interface InterfaceA {
	abstract void print();
}

class ClassA implements InterfaceA {
	@Override
	public void print() {
		System.out.println("ClassA");
	}
}

class ClassB {
	InterfaceA interfaceA;
	
	ClassB(InterfaceA interfaceA) {
		this.interfaceA = interfaceA;
	}
	
	void print() {
		interfaceA.print(); // interface�� ���
							// ����ü�� ������, �� �س��� ����������
	}
}

public class MainA {
	public static void main(String[] args) {
		
	}
}

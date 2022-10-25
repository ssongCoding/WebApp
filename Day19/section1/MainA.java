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
		interfaceA.print(); // interface를 사용
							// 구현체가 누구든, 뭘 해놨든 노상관이지만
	}
}

public class MainA {
	public static void main(String[] args) {
		
	}
}

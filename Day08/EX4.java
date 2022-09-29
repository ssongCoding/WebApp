class Fruit {
	void printColor() {
		System.out.println("색깔");
	}
}

class Apple extends Fruit{
	void eat() {
		System.out.println("아이 맛있어");
	}
}

public class EX4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a = new Apple();
		a.printColor();
		a.eat();
	}
}

package section1;

public class Test {
	public static void main(String[] args) {
		
		Connection c1 = Connection.get();
		c1.count(); // 1
		
		Connection c2 = Connection.get();
		c2.count(); // 2
		
		Connection c3 = Connection.get();
		c3.count();
		
		System.out.println(c1.getNum());
		System.out.println(Connection.get().getNum());
	}
}
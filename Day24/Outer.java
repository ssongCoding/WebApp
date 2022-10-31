
public class Outer {
	
	private String field1;
	private String field2;
	private String field3;
	
	private Outer(String field1) {
		this.field1 = field1;
	}
	
	public static class Inner {
		
		String field1;
		
		Inner(String field1) {
			this.field1 = field1;
		}
		
		public Outer method() {
			Outer o = new Outer(field1);
			return o;
		}
	}
	
	/*
	public Outer(String field1) {
		this.field1 = field1;
	}
	
	public Outer(String field1, String field2) {
		this(field1); // �� ��ü�� ���� ������ �߿� �� �Ű����� ���� �� �ִ� ������ ȣ��
		this.field2 = field2;
	}
	
	public Outer(String field1, String field2, String field3) {
		this(field1, field2);
		this.field3 = field3;
	}*/
	
	@Override
	public String toString() {
		return field1 + " " + field2 + " " + field3;
	}

	void outMethod() {
		System.out.println(this.toString());
	}
}

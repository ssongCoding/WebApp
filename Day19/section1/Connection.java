package section1;

class Connection { 
	private int num = 0; // �ʵ� = ��ü�� ���� ������ ����
	private static Connection init = null;
		
	static public Connection get() {
		if(init == null) {
			init = new Connection();
		}
		
		return init;
	}	
		
	public void count() {
		num++;
	}
	
	public int getNum() {
		return num;
	}
}
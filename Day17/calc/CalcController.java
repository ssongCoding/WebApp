package calc;

public class CalcController {

	public static void main(String[] args) {
		// ����� ��û �ޱ�
		int a = 10;
		int b = 20;
		
		// Model, View ���� �� ��Ű��
		CalcModel m = new CalcModel();
		int result = m.plus(a,b);
		
		// ����ڿ��� �������ֱ� (view�� ������)
		CalcView v = new CalcView();
		v.print(result);
	}
}
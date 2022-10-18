package calc;

public class CalcController {

	public static void main(String[] args) {
		// 사용자 요청 받기
		int a = 10;
		int b = 20;
		
		// Model, View 한테 일 시키기
		CalcModel m = new CalcModel();
		int result = m.plus(a,b);
		
		// 사용자에게 응답해주기 (view를 돌려줌)
		CalcView v = new CalcView();
		v.print(result);
	}
}
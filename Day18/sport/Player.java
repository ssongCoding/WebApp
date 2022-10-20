package sport;

/**
 * DTO
 * DB���� ������(1��)�� �о���� ��� �ٴ� �� �ִ� ��ü
 * ����ڿ��� �Է� �޾Ƽ� ������ �����͸� ��� �ٴϴ� ��ü
 * "�����͸� ��� �ٴϴ� ��ü"
 * 1) ������ ���̽� 1�� ���
 * 2) ���� �����͵��� �ϳ��� ��ü�� ���μ� ���
 * 3) ���� ����
 * 
 * @author ITSC
 */
public class Player {
	private int index;
	private String name;
	private int playerNum;
	
	Player(int index, String name, int playerNum) {
		this.index = index;
		this.name = name;
		this.playerNum = playerNum;
	}
	
	int getIndex() {
		return index;
	}
	
	String getName() {
		return name;
	}
	
	int getPlayerNum() {
		return playerNum;
	}
}

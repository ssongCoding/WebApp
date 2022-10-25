package sport;

/**
 * DTO
 * DB에서 데이터(1행)를 읽어오면 들고 다닐 수 있는 객체
 * 사용자에게 입력 받아서 생성된 데이터를 들고 다니는 객체
 * "데이터를 들고 다니는 객체"
 * 1) 데이터 베이스 1행 운반
 * 2) 여러 데이터들을 하나의 객체로 감싸서 운반
 * 3) 정보 은닉
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

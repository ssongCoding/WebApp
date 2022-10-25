package sport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerRepository {

	Map<Integer,Player> db = new HashMap<Integer,Player>();
	// ������ ����� = foreach�� / while
	
	void save(Player player) {
		db.put(player.getIndex(), player);
		System.out.println(player.getName() + " ���� ���� �Ϸ�");
	}
	
	List<Player> findAll() {
		List<Player> result = new ArrayList<Player>();
		
		for(Integer key:db.keySet()) {// for (each:���)
			result.add(db.get(key));  // value
		}
		
		return result;
	}
}







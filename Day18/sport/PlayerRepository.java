package sport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerRepository {

	Map<Integer,Player> db = new HashMap<Integer,Player>();
	// 순서가 없어요 = foreach문 / while
	
	void save(Player player) {
		db.put(player.getIndex(), player);
		System.out.println(player.getName() + " 선수 영입 완료");
	}
	
	List<Player> findAll() {
		List<Player> result = new ArrayList<Player>();
		
		for(Integer key:db.keySet()) {// for (each:덩어리)
			result.add(db.get(key));  // value
		}
		
		return result;
	}
}







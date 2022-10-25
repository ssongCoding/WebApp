package sport;

import java.util.List;

public class PlayerController {

	PlayerRepository playerRepository;
	
	public PlayerController(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	/**
	 * ���� ���� �޼ҵ�
	 * 1) Player ��¥ ��ü 'player'�� ���� 
	 * 2) repository.save(player)
	 */
	void scout(Player player) {
		playerRepository.save(player);
	}
	
	/**
	 * ���� ���̺� ��ü ��ȸ(���)
	 */
	void info() {
		List<Player> res = playerRepository.findAll();
		
		for(int i=0;i<res.size();i++) {
			System.out.println(
					res.get(i).getIndex() + " "
					+ res.get(i).getName() + " "
					+ res.get(i).getPlayerNum());
		}
	}
}






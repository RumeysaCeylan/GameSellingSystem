package Abstract;

import Adapter.MernisAdapter;
import Entities.Gamer;

public class GamerCheckService implements IGamerCheckService{

	@Override
	public boolean GamerCheck(Gamer gamer) {
		return true;
	}

}

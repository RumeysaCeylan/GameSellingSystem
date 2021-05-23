package Concrete;

import Abstract.GamesSellingManager;
import Abstract.IGamerCheckService;
import Entities.Gamer;
import Entities.Games;

public class SellingManager extends GamesSellingManager{
	IGamerCheckService gamerCheck;

	public SellingManager(IGamerCheckService gamerCheck) {
		super();
		this.gamerCheck = gamerCheck;
	}
	@Override
	public double add(Gamer gamer, Games[] games) {
		if(gamerCheck.GamerCheck(gamer))
		return super.add(gamer, games);
		else {
			System.out.println("error");
			return 0;
		}
	}

	@Override
	public double remove(Gamer gamer, Games games) {
		if(gamerCheck.GamerCheck(gamer))
		return super.remove(gamer, games);
		else{
			System.out.println("error");
			return 0;
		}
	}


	
}

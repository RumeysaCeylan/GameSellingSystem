package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	IGamerCheckService gamerCheck;
	public GamerManager(IGamerCheckService gamerCheck) {
		super();
		this.gamerCheck = gamerCheck;
	}
	@Override
	public void save(Gamer gamer) {
		if(gamerCheck.GamerCheck(gamer)) {
			super.save(gamer);
		}
		else {
			System.out.println("error not approved person");
		}
	}
		@Override
	public void update(Gamer gamer) {
			if(gamerCheck.GamerCheck(gamer)) {
				super.update(gamer);
			}
			else {
				System.out.println("error not approved person");
			}
		}
			@Override
		public void delete(Gamer gamer) {
				if(gamerCheck.GamerCheck(gamer)) {
					super.delete(gamer);
				}
				else {
					System.out.println("error not approved person");
				}
			}
		
	

}

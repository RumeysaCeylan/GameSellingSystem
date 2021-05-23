package Abstract;

import Entities.Gamer;
import Entities.Games;

public abstract class GamesSellingManager {
	
	private double total=0;
	
	
	public double add(Gamer gamer,Games[] games) {
	for(int i=0;i<games.length;i++) {
		System.out.println("kullanýcý "+gamer.getName()+" sepetinize ürün eklendi\n"+games[i].getGameName()+
				" adlý oyun sepetinize eklendi ");
		total+=games[i].getPrice();
	}
		System.out.println("tutar "+total);
		gamer.setTotal(total);
		return total;
				
	}
	public double remove(Gamer gamer,Games games) {
		
		
			System.out.println(gamer.getName()+" sepetinizden ürün çýkarýldý "+games.getGameName());
			total=gamer.getTotal();
			total-=games.getPrice();
			
			System.out.println("çýkarýldý - "+total);
			gamer.setTotal(total);
			return -total;
	
	}
}

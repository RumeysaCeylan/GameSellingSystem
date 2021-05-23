package Abstract;

import Entities.Gamer;
import Entities.Games;

public abstract class GamesSellingManager {
	
	private double total=0;
	
	
	public double add(Gamer gamer,Games[] games) {
	for(int i=0;i<games.length;i++) {
		System.out.println("kullan�c� "+gamer.getName()+" sepetinize �r�n eklendi\n"+games[i].getGameName()+
				" adl� oyun sepetinize eklendi ");
		total+=games[i].getPrice();
	}
		System.out.println("tutar "+total);
		gamer.setTotal(total);
		return total;
				
	}
	public double remove(Gamer gamer,Games games) {
		
		
			System.out.println(gamer.getName()+" sepetinizden �r�n ��kar�ld� "+games.getGameName());
			total=gamer.getTotal();
			total-=games.getPrice();
			
			System.out.println("��kar�ld� - "+total);
			gamer.setTotal(total);
			return -total;
	
	}
}

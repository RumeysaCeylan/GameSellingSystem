package Concrete;

import Entities.Gamer;
import Entities.Games;

public class GamesSellingManager  {
	double total=0;
	public double add(Gamer gamer,Games[] games) {
	for(int i=0;i<games.length;i++) {
		System.out.println("kullan�c� "+gamer.getName()+" sepetinize �r�n eklendi\n"+games[i].getGameName()+
				" adl� oyun sepetinize eklendi ");
		total+=games[i].getPrice();
	}
		System.out.println("tutar "+total);
		return total;
				
	}
	public double remove(Gamer gamer,Games games) {
		
		
			System.out.println(gamer.getName()+" sepetinizden �r�n ��kar�ld� "+games.getGameName());

			total-=games.getPrice();
			System.out.println("��kar�ld� - "+total);
			return -total;
	
	}
}

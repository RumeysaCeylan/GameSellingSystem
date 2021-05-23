import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Abstract.GamesSellingManager;
import Adapter.MernisAdapter;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.SellingManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager baseManager = new GamerManager(new MernisAdapter());
		Gamer gamer = new Gamer();
		gamer.setlName("bbb");
		gamer.setName("aaa");
		gamer.setTcNo("12345678910");
		gamer.setDate(1999);
		
		baseManager.save(gamer);
		Games[] games = new Games[3] ;
		games[0]=new Games("CS GO",0,1);
		games[1]=new Games("AMONG US",10.5,2);
		games[2]=new Games("ABC",22.75,2);
		
		GamesSellingManager gamesSellingManager = new SellingManager(new MernisAdapter());
		gamesSellingManager.add(gamer, games);
		gamesSellingManager.remove(gamer, games[1]);
		Sales sale = new Sales();
		sale.setSalePercentage(10);
		SaleManager manager = new SaleManager();
		manager.addSale(sale, gamer);
	}

}

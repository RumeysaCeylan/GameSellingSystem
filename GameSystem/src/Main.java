import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Adapter.MernisAdapter;
import Concrete.GamerManager;
import Concrete.GamesSellingManager;
import Concrete.SaleManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager baseManager = new GamerManager(new MernisAdapter());
		Gamer gamer = new Gamer();
		gamer.setlName("AAA");
		gamer.setName("BBB");
		gamer.setTcNo("123456789");
		gamer.setDate(1999);
		double total=0;
		baseManager.save(gamer);
		Games[] games = new Games[3] ;
		games[0]=new Games("CS GO",0,1);
		games[1]=new Games("AMONG US",10.5,2);
		games[2]=new Games("ABC",22.75,2);
		
		GamesSellingManager gamesSellingManager = new GamesSellingManager();
		total+=gamesSellingManager.add(gamer, games);
		total+=gamesSellingManager.remove(gamer, games[1]);
		System.out.println("indirimsiz  "+total);	
		Sales sale = new Sales();
		sale.setSalePercentage(10);
		SaleManager manager = new SaleManager();
		manager.addSale(sale, total);
	}

}

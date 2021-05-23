package Abstract;

import Entities.Gamer;
import Entities.Sales;

public interface ISaleService {
	void addSale(Sales sale,Gamer gamer);
	void updateSale(Sales sale,Gamer gamer);
	void deleteSale(Sales sale,Gamer gamer);
}

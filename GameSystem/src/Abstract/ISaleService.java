package Abstract;

import Entities.Sales;

public interface ISaleService {
	void addSale(Sales sale,double total);
	void updateSale(Sales sale,double total);
	void deleteSale(Sales sale,double total);
}

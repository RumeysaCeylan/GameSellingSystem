package Concrete;

import Abstract.ISaleService;
import Entities.Sales;

public class SaleManager implements ISaleService{
	
	@Override
	public void addSale(Sales sale, double total) {
		total=total-total*sale.getSalePercentage()/100;
		System.out.println("ödemeniz gereken miktar "+total);
		
	}

	@Override
	public void updateSale(Sales sale, double total) {
		total=total-total*sale.getSalePercentageS()/100;
		System.out.println("ödemeniz gereken miktar "+total);
		
	}

	@Override
	public void deleteSale(Sales sale, double total) {
		
		System.out.println("ödemeniz gereken miktar "+total);
	}
}

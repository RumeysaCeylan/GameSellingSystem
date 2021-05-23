package Concrete;


import Abstract.ISaleService;
import Entities.Gamer;
import Entities.Sales;

public class SaleManager implements ISaleService{
	private double temp;
	@Override
	public void addSale(Sales sale, Gamer gamer) {
		
		temp=gamer.getTotal()-gamer.getTotal()*sale.getSalePercentage()/100;
		System.out.println("ödemeniz gereken miktar "+temp);
		
	}

	@Override
	public void updateSale(Sales sale, Gamer gamer) {
		temp=gamer.getTotal()-gamer.getTotal()*sale.getSalePercentage()/100;
		System.out.println("ödemeniz gereken miktar "+temp);
		
	}

	@Override
	public void deleteSale(Sales sale, Gamer gamer) {
		temp=gamer.getTotal()+gamer.getTotal()*sale.getSalePercentage()/100;
		System.out.println("ödemeniz gereken miktar ");
	}

}

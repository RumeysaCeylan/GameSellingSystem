package Entities;

public class Sales {
	private int SalePercentage;
	private int SalePercentageS;
	public Sales() {
		
		
	}
	public Sales(int salePercentage, int salePercentageS) {
		super();
		SalePercentage = salePercentage;
		SalePercentageS = salePercentageS;
		
	}
	public int getSalePercentageS() {
		return SalePercentageS;
	}
	public void setSalePercentageS(int salePercentageS) {
		SalePercentageS = salePercentageS;
	}
	public int getSalePercentage() {
		return SalePercentage;
	}
	
	public void setSalePercentage(int salePercentage) {
		SalePercentage = salePercentage;
	}
}


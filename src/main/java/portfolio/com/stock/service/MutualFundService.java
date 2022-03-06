package portfolio.com.stock.service;

public class MutualFundService {

	StockService2 stockService2;

	public MutualFundService(StockService2 stockService2) {
		this.stockService2 = stockService2;
	}

	@Override
	public String toString() {
		return "MutualFundService [" + stockService2 +  "]";
	}

}

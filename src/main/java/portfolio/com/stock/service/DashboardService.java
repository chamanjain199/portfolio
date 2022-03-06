package portfolio.com.stock.service;

public class DashboardService {

	StockService stockService;

	public DashboardService(StockService stockService) {
		this.stockService = stockService;
	}

	@Override
	public String toString() {
		return "DashboardService [" + stockService + " :: " + stockService.stock + "]";
	}

}

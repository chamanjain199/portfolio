package portfolio.com.stock.controller;

import portfolio.com.stock.model.Stock;
import portfolio.com.stock.service.StockService;
import portfolio.com.stock.service.StockService2;

public class StockController {

	StockService stockService;
	StockService2 stockService2;


	Stock stock;

	public StockController(StockService stockService,StockService2 stockService2, Stock stock) {
		this.stockService = stockService;
		this.stockService2=stockService2;
		this.stock = stock;
	}

	public void addSave() {
		stockService.saveStock();
	}

	@Override
	public String toString() {
		return " [StockController " + stockService2 + " ] ";
	}

}

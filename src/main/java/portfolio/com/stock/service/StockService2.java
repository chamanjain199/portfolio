package portfolio.com.stock.service;

import org.springframework.beans.factory.annotation.Lookup;

import portfolio.com.stock.model.Stock;
import portfolio.com.stock.repository.StockRepository;

public class StockService2 {

	StockRepository stockRepository;
	Stock stock;
	String name;

	public StockService2(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	public void saveStock() {

		System.out.print(stockRepository.toString());

	}

	@Override
	public String toString() {
		return " [StockService2 :: " + process() + "] ";
	}

	public Stock process() {
		stock = createCommand();
		return stock;
	}

	@Lookup("stock")
	Stock createCommand() {

		return null;

	}
}

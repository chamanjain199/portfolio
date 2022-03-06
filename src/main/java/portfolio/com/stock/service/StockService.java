package portfolio.com.stock.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import portfolio.com.stock.model.Stock;
import portfolio.com.stock.repository.StockRepository;

public class StockService implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	StockRepository stockRepository;
	Stock stock;
	String name;

	public StockService(StockRepository stockRepository, Stock stock) {
		this.stockRepository = stockRepository;
		this.stock = stock;
	}

	public void saveStock() {

		System.out.print(stockRepository.toString());

	}

	@Override
	public String toString() {
		return " [StockService :: " + process() + "] ";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

	public Stock process() {
		stock = createCommand();
		return stock;
	}

	protected Stock createCommand() {
		return this.applicationContext.getBean("stock", Stock.class);
	}
}

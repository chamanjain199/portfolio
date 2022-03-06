import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import portfolio.com.stock.controller.StockController;
import portfolio.com.stock.service.DashboardService;
import portfolio.com.stock.service.MutualFundService;
import portfolio.com.stock.service.StockService;

public class Main {

	public static void main(String[] args) {

		StockController controller;

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		controller = (StockController) context.getBean("stockController");
		//controller.addSave();
		System.out.print(controller.toString());

//		StockService servcice = (StockService) context.getBean("stockService");
//
//		System.out.print(servcice.toString());

//		DashboardService dashboardService = (DashboardService) context.getBean("dashboardService");
//		System.out.print(dashboardService.toString());
		
		MutualFundService mutualFundService = (MutualFundService) context.getBean("mutualFundService");
		System.out.print(mutualFundService.toString());

	}

}

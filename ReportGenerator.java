package co.edu.tdea;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

	 private List<Product> products;
	    private double totalRevenue;
	    private int totalSales;

	    public ReportGenerator() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Product product, double salePrice) {
	        products.add(product);
	        totalRevenue += salePrice;
	        totalSales++;
	    }

	    public double calculateProfit(double productionCost) {
	        return totalRevenue - productionCost;
	    }

	    public int getTotalSales() {
	        return totalSales;
	    }
	}


package portfolio.com.stock.model;

public class Stock {
	
	private String id;
	private int price;
	private String name;
	private String nseScriptName;
	private String fullName;
	private int qnty;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNseScriptName() {
		return nseScriptName;
	}
	public void setNseScriptName(String nseScriptName) {
		this.nseScriptName = nseScriptName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}

}

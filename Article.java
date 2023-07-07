package toto;



public class Article {
	
	private int id;
	private String Type;
	private double price;
	public Article(int id ,String Type , double price) {
		this.id =id;
		this.Type =Type;
		this.price =price;
	}
	public int getId() {
		return id;
	}
	public String getType() {
		return Type;
	}
	public double getPrice() {
		return price;
	}
	public boolean next() {
				return false;
	}
	
}


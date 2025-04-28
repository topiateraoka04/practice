public class Book extends TangibleAsset{
	String name;
	int price;
	String color;
	String isbn;
	public Book(String name,int price,String color,String isbn) {
		super(name,price,color);
		this.isbn = isbn;
	}
	//public String getName() {return name;}
	//public int getPrice() {return price;}
	//public String getColor() {return color;}
	public String getIsbn() {
		return isbn;
	}
	
}
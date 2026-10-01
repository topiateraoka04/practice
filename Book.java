public class Book extends Tangibleasset{
	private String isbn;
	public Book(String name,ont price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}

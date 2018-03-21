import java.util.Date;

public class WorkShopApplication {


	private Product1 product1 = new Product1(new Product());
	private String cliFirstName;
	
	private Invoice Invoice1 = new Invoice(new Product(), new Client());
	
	//Invoice line information
	private int numInvoiceLine;
	private int numArticles;
	private int codArt;
	private int codQuantity;
	

}

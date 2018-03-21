import java.util.Date;

public class WorkShopApplication {

	private Product1 productOne = new Product1(new Product());
	private String cliFirstName;
	
	//Invoice information
	private int codInvoice;
	private Date dateInvoice;
	private double sum;
	private int discount;
	
	//Invoice line information
	private int numInvoiceLine;
	private int numArticles;
	private int codArt;
	private int codQuantity;
}

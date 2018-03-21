import java.util.Date;

public class WorkShopApplication {

	private Product data = new Product();
	//Client information
	private int codCli;
	private String cliDNI;
	private String cliName;
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

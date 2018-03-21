
public class Invoice {
	public Product data;
	public int codCli;
	public String cliDNI;
	public String cliName;
	public Client Client1;
	public int discount;
	public int numInvoiceLine;
	public int numArticles;
	public int codArt;
	public int codQuantity;

	public Invoice(Product data, Client client1) {
		this.data = data;
		Client1 = client1;
	}
}
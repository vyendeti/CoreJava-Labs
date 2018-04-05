import static java.lang.System.out;

class Entry{
	
	
	public static void main(String[] args){
		out.println("Hello, world!");
		
		Customer c = null;
		
		c = new Customer();
		c.displayDetails();

		c = new Customer("RAJ",412101);
		c.displayDetails();
		
		c.getInvoices();
		
	}
	
	
}







